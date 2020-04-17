package com.atguigu.day04;

import java.util.Scanner;

public class Day04Work4{
    public static void main(String[] args){
        //输入年月日，判断该日是当年的第几天
        //输入一个时间2019年 月 日
        //判断大月为31天
        //判断小月为30天 
        //判断二月为29天

        Scanner in = new Scanner(System.in);
        System.out.println("请输入年");
        int years = 2020;
        System.out.println("请输入月");
        int month = 1;
        System.out.println("请输入日");
        int days = 0;
        int i = 0;
        
            while(i<=month){
                switch (i){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = days + 31;
                        break;
                    case 2:
                        if((years % 4 == 0) || years % 100 == 0){
                            days = days + 29;
                            System.out.println(days);
                        }else{
                            days = days + 28;
                            System.out.println(days);
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = days + 30;
                        break;
                }
                i++;
            }
        
             System.out.println(days-31);//减31是 1月0天 代表0天 1月31天才代表31天,所以减去一个31
    }
}