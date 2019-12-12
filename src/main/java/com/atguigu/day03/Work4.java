package com.atguigu.day03;

import java.util.*;
public class Work4{
    public static void main(String[] args){
        //【选作】1、开发一款软件，根据公式（身高-108）*2=标准体重，可以有10斤左右的浮动。来观察测试者体重是否合适。
        Scanner in = new Scanner(System.in);
        System.out.println("身高");
        double height = in.nextDouble();
        System.out.println("体重");
        double weight = in.nextDouble();
        double standardweight = (height - 108) * 2;
        System.out.println("标准体重"+standardweight);
        
        if(weight<=standardweight+10 && weight>=standardweight-10){
             System.out.println("适合");
        }else if(weight<standardweight-10){
             System.out.println("偏瘦");
        }else{
             System.out.println("偏重");
        }

 
    }
}