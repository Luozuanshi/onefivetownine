package com.domo;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MvcGenerator {

    private final static String mavenProjectDirectory = File.separator+"src"+File.separator+"main"+File.separator+"java";
    private final static String controllerPath = "meinian_web" + mavenProjectDirectory;
    private final static String servicePath = "meinian_interface" + mavenProjectDirectory;
    private final static String serviceImplPath = "meinian_service" + mavenProjectDirectory;
    private final static String daoPath = "meinian_dao" + mavenProjectDirectory;
    private final static String packagePath = "com.mainian";
    private final static String type = "Dubbo";
//    private final static String type = "Spring";
//    private final static String type = "SpringBoot";

    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        boolean findById = generator("/user/findById?id=1");
        boolean update = generator("/user/update?id=1&name=张三");
        System.out.println(findById);
        System.out.println(update);
    }

    private static String projectPath = "";
    private static boolean generator(String url) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        projectPath = packagePath.replace(".", File.separator);
        //获取项目路径
        String path = System.getProperty("user.dir");
        System.out.println("项目路径: " + path);
        //获取类名
        String className = getClassName(url);
        classS = className;
        if (className.charAt(0) >= 97) {
            className = (char)(className.charAt(0) - 32) + className.substring(1);
        }
        classB = className;
        System.out.println("类名: " + className);
        //获取方法名
        String methodName = getMethodName(url);
        method = methodName;
        System.out.println("方法名: " + methodName);
        //获取参数
        String paramsAll = getParams(url);
        params = paramsAll;
        System.out.println("参数: " + paramsAll);
        //处理ControllerJava源文件
        run(path, projectPath, "Controller", controllerPath);
        //处理ServiceJava源文件
        run(path, projectPath, "Service", servicePath);
        //处理ServiceImplJava源文件
        run(path, projectPath, "ServiceImpl", serviceImplPath);
        //处理DaoJava源文件
        run(path, projectPath, "Dao", daoPath);
        return true;
    }

    private static boolean run(String path, String projectPath, String model, String pagePath) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        StringBuilder modelS = new StringBuilder();
        for (int i = 0; i < model.length(); i++) {
            char c = model.charAt(i);
            if (c <= 90) {
                modelS.append(File.separator);
                c += 32;
            }
            modelS.append(c);
        }
        File classFile = findFile(new File(path), classB + model + ".java");
        if (classFile == null) {
            System.out.println(model + "源文件不存在");
            classFile = new File(path + File.separator + pagePath + File.separator +  projectPath + File.separator + modelS.toString() + File.separator + classB + model + ".java");
        }
        System.out.println(model + "源文件路径: " + classFile.getCanonicalPath());
        if (!classFile.exists()) {//源文件不存在
            creatFile(classFile, model);
        } else {//源文件存在
            appendFile(classFile, model);
        }
        return true;
    }

    private static String getClassName(String url) {
        String className;
        if (url.charAt(0) == '/') {
            className = url.substring(1, url.indexOf("/", 1));
        } else {
            className = url.substring(0, url.indexOf("/"));
        }
        return className;
    }

    private static String getMethodName(String url) {
        int end = url.indexOf("?");
        if (end == -1) {
            return url.substring(url.indexOf("/", 1) + 1);
        } else {
            return url.substring(url.indexOf("/", 1) + 1, end);
        }
    }

    private static String getParams(String url) {
        int flag = url.indexOf("?");
        if (flag != -1) {
            url = url.substring(flag + 1);
            StringBuilder params = new StringBuilder();
            StringBuilder methodParamsBuilder = new StringBuilder();
            String[] paramsArr = url.split("&");
            for (int i = 0; i < paramsArr.length; i++) {
                methodParamsBuilder.append("String ").append(paramsArr[i].split("=")[0]);
                params.append(paramsArr[i].split("=")[0]);
                if (i < paramsArr.length - 1) {
                    params.append(", ");
                    methodParamsBuilder.append(", ");
                }
            }
            methodParams = methodParamsBuilder.toString();
            return params.toString();
        }
        return "";
    }

    private static void creatFile(File file, String methodType) throws IOException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method method = MvcGenerator.class.getDeclaredMethod("creat" + type + methodType + "Template");
        method.setAccessible(true);
        byte[] bytes = (byte[])method.invoke(null);

        creatParentFile(file);//创建父文件夹
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(bytes);
        close(outputStream);
    }

    private static void appendFile(File file, String methodType) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        Method method = MvcGenerator.class.getDeclaredMethod("append" + type + methodType + "Template");
        method.setAccessible(true);
        byte[] bytes = (byte[])method.invoke(null);

        InputStream inputStream = new FileInputStream(file);
        String result = readAllToString(inputStream);
        int index = result.lastIndexOf("}");

        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.seek(index);
        randomAccessFile.write(bytes);

    }

    private static String classS = "";
    private static String classB = "";
    private static String method = "";
    private static String params = "";
    private static String methodParams = "";

    private static byte[] creatDubboControllerTemplate() {
        String  template =
                "package "+packagePath+".controller;\n" +
                "\n" +
                "import com.alibaba.dubbo.config.annotation.Reference;\n" +
                "import "+packagePath+".service."+classB+"Service;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.RestController;\n" +
                "\n" +
                "@RestController\n" +
                "@RequestMapping(\"/"+classS+"\")\n" +
                "public class "+classB+"Controller {\n" +
                "\n" +
                "    @Reference\n" +
                "    private "+classB+"Service "+classS+"Service;\n" +
                "\n" +
                "    @RequestMapping(\"/"+method+"\")\n" +
                "    public void "+method+"("+methodParams+") {\n" +
                "        "+classS+"Service."+method+"("+params+");\n" +
                "    }\n" +
                "\n" +
                "}\n";
        return template.getBytes();
    }

    private static byte[] creatDubboServiceTemplate() {
        String  template =
                "package "+packagePath+".service;\n" +
                "\n" +
                "public interface "+classB+"Service {\n" +
                "    void "+method+"("+methodParams+");\n" +
                "}\n";
        return template.getBytes();
    }

    private static byte[] creatDubboServiceImplTemplate() {
        String  template =
                        "package "+packagePath+".service.impl;\n" +
                        "\n" +
                        "import com.alibaba.dubbo.config.annotation.Service;\n" +
                        "import "+packagePath+".dao."+classB+"Dao;\n" +
                        "import "+packagePath+".service."+classB+"Service;\n" +
                        "import org.springframework.beans.factory.annotation.Autowired;\n" +
                        "import org.springframework.transaction.annotation.Transactional;\n" +
                        "\n" +
                        "@Service(interfaceClass = "+classB+"Service.class)\n" +
                        "@Transactional\n" +
                        "public class "+classB+"ServiceImpl implements "+classB+"Service {\n" +
                        "\n" +
                        "    @Autowired\n" +
                        "    private "+classB+"Dao "+classS+"Dao;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void "+method+"("+methodParams+") {\n" +
                        "        "+classS+"Dao."+method+"("+params+");\n" +
                        "    }\n" +
                        "\n" +
                        "}";
        return template.getBytes();
    }

    private static byte[] creatDubboDaoTemplate() {
        String  template =
                        "package "+packagePath+".dao;\n" +
                        "\n" +
                        "public interface "+classB+"Dao {\n" +
                        "    void "+method+"("+methodParams+");\n" +
                        "}\n";
        return template.getBytes();
    }

    private static byte[] appendDubboControllerTemplate() {
        String  template =
                        "    @RequestMapping(\"/"+method+"\")\n" +
                        "    public void "+method+"("+methodParams+") {\n" +
                        "        "+classS+"Service."+method+"("+params+");\n" +
                        "    }\n" +
                        "\n" +
                        "}\n";
        return template.getBytes();
    }

    private static byte[] appendDubboServiceTemplate() {
        String  template =
                        "    void "+method+"("+methodParams+");\n" +
                        "}\n";
        return template.getBytes();
    }

    private static byte[] appendDubboServiceImplTemplate() {
        String  template =
                        "    @Override\n" +
                        "    public void "+method+"("+methodParams+") {\n" +
                        "        "+classS+"Dao."+method+"("+params+");\n" +
                        "    }\n" +
                        "\n" +
                        "}";
        return template.getBytes();
    }

    private static byte[] appendDubboDaoTemplate() {
        String  template =
                        "    void "+method+"("+methodParams+");\n" +
                        "}\n";
        return template.getBytes();
    }

    private static File findFile(File file, String target) {
        if (file.isFile()) {
            if (file.getName().equals(target)) {
                return file;
            } else {
                return null;
            }
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                File temp = findFile(f, target);
                if (temp != null) {
                    return temp;
                }
            }
        }
        return null;
    }

    private static void creatParentFile(File file) {
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
    }

    private static String readAllToString(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1)
            sb.append(new String(bytes, 0, len));
        close(inputStream);
        return sb.toString();
    }

    private static void close(Closeable... closeables) {
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException ignored) { }
            }
        }
    }

}
