package com.atguigu.day03;

import java.util.*;
public class Work2{
    public static void main(String[] args){
        //3、判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如： 153 = 1*1*1 + 3*3*3 + 5*5*5   ★ 
        int num1 =153;
        int ge =num1 / 100;
        int shi =num1 % 100 / 10;
        int bai =num1 %10;
        System.out.println(ge+" "+shi+" "+bai);            
        if(ge*ge*ge+shi*shi*shi+bai*bai*bai == num1){
            System.out.println("水仙花数");            
        }
    }
}