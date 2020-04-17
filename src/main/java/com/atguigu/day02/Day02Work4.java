package com.atguigu.day02;

import java.util.Scanner;

/**
    һ��ʵ�����������ļӼ��˳��Լ�ȡ���㷨

���������������ֱ𱣴����������������������������ѡ������������룬����ֱ���ñ������桿

ʾ��Ч�����£�


�������һ��������10
������ڶ���������5

*************************************

	    СС������


*************************************

10 + 5 =15

10 - 5 = 5

10 * 5 = 50

10 / 5 = 2
 */

public class Day02Work4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        System.out.println("�������һ��������"+num1);
        System.out.println("������ڶ���������"+num2);
        System.out.println(num1+" + "+ num2 +" = "+(num1+num2) );
        System.out.println(num1+" - "+ num2 +" = "+(num1-num2) );
        System.out.println(num1+" * "+ num2 +" = "+(num1*num2) );
        System.out.println(num1+" / "+ num2 +" = "+(num1/num2) );

    }
}