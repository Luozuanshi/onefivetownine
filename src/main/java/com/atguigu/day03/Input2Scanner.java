import java.util.*;
public class Input2Scanner{
    public static void main(String[] args){
        //从控制台接收用户接收的用户信息[姓名,年龄,薪水]
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = myscanner.next();
        
        System.out.println("请输入年龄");
        int age = myscanner.nextInt();

        System.out.println("请输入薪水");
        Double salary = myscanner.nextDouble();

        System.out.println("用户输入的信息如下:");
        System.out.println("年龄是:"+name);
        System.out.println("年龄是:"+age);
        System.out.println("薪水是:"+salary);

    }
}