package src.main.java.com.atguigu.WorkExer;

import java.io.*;

/**
 * 17、请编写代码把一个GBK的文本文件内容读取后存储到一个UTF-8的文本文件中。
 */
public class IOExer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("aaa.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");

        FileOutputStream fos = new FileOutputStream("bbb.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

        char[] c = new char[1024];
        int len=0;
        while((len = isr.read(c))!=-1){
            osw.write(c,0,len);
        }

        isr.close();
        fis.close();
        osw.close();
        fos.close();
    }
}
