import java.util.*;
public class Work2{
    public static void main(String[] args){
        /*1.输出格式------------------------------小小计算器-------------------------

            1.加法
            2.减法
            3.乘法
            4.除法
            0.退出
            请选择：1
            10+5=15
            */
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------小小计算器-------------------------");
        System.out.println("1.加法");
        System.out.println("2.减法");
        System.out.println("3.乘法");
        System.out.println("4.除法");
        System.out.println("0.退出");
       
        System.out.println("请输入两个数:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        while(true){
            System.out.println("请选择功能:");
            int funcnum =in.nextInt();

            switch (funcnum){
                case 1:
                System.out.println(num1+" + "+ num2 +" = "+(num1+num2));
                break;
                case 2:
                System.out.println(num1+" - "+ num2 +" = "+(num1+num2));
                break;
                case 3:
                System.out.println(num1+" * "+ num2 +" = "+(num1+num2));
                break;
                case 4:
                System.out.println(num1+" / "+ num2 +" = "+(num1+num2));
                case 0:
                System.exit(0);
                default:
                System.out.println("输入的数有错误");
            }

        }
    }
}