/**
    一、实现两个整数的加减乘除以及取余算法

定义两个变量，分别保存键盘输入的两个整数【键盘输入可选，如果不用输入，可以直接用变量保存】

示例效果如下：


请输入第一个整数：10
请输入第二个整数：5

*************************************

	    小小计算器


*************************************

10 + 5 =15

10 - 5 = 5

10 * 5 = 50

10 / 5 = 2
 */

import java.util.*;

public class Day02Work4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        System.out.println("请输入第一个整数："+num1);
        System.out.println("请输入第二个整数："+num2);
        System.out.println(num1+" + "+ num2 +" = "+(num1+num2) );
        System.out.println(num1+" - "+ num2 +" = "+(num1-num2) );
        System.out.println(num1+" * "+ num2 +" = "+(num1*num2) );
        System.out.println(num1+" / "+ num2 +" = "+(num1/num2) );

    }
}