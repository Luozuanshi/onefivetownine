package com.atguigu.day03;

import java.util.*;
public class Work1{
    public static void main(String[] args){
        //2、判断一个年份是否为闰年 ★ [（1）可以被4整除，并且不能被100整除 （2） 能被400整数]
        int years = 2004;
        String IsRyears = ( (years % 4 == 0 && years % 100 != 0) || years % 400 ==0 ) ? "是闰年" : "不是闰年";  
        System.out.println(years + IsRyears);
    
    }
}