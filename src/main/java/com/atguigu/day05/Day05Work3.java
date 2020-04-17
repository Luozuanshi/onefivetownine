package com.atguigu.day05;

import java.util.Scanner;

public class Day05Work3{
    public static void main(String[] args){
        //1. 循环打印输入的月份的天数。 【使用continue实现】
        //–要有判断输入的月份是否错误的语句 
        int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};
        Scanner in =new Scanner(System.in);

        while(true){
                System.out.print("请输入年:");
                int inputYears =in.nextInt();
                System.out.println("您输入的年份是" + inputYears);
                System.out.print("请输入月:");
                int inputMonth =in.nextInt();

                    for(int i = 0;i<month.length;i++){

                         if(inputMonth==month[i]){
                        System.out.println("您输入的月份是" + month[i]);
                        System.out.print("请输入日:");
                                int inputDay = in.nextInt();
                                System.out.println("您输入的日期是" +inputYears+"年"+inputMonth+"月"+inputDay+"日");
                        }else if(i==month.length-1){
                            System.out.println("您输入的月份是错误");

                        }
                        
                    
                }
           

        }
    


        

    }
}