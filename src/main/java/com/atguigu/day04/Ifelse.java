package com.atguigu.day04;

import java.util.Scanner;

public class Ifelse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = in.nextInt();
        System.out.println("请输入月份");
        int month = in.nextInt();

        if(month >= 4 && month <= 10){
            if(age>18 && age <60){
                System.out.println("成人:60");
            }else if(age <18){
                System.out.println("儿童:半价");
            }else{
                System.out.println("老人:1/3");
            }
        }else{
                System.out.println("成人:40");
                System.out.println("其他:20");
        }
    }
}