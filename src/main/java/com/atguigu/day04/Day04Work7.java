package com.atguigu.day04;

import java.util.*;
public class Day04Work7{
    public static void main(String[] args){
        //九九乘法表
        for(int i =1;i<=9;i++){
            for(int j=1;j<=i;j++){
            System.out.print(i+" * " + j + " = "+( i * j )+"    " );
        }
        System.out.println();
    }
    }
}
