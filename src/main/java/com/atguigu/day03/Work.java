package com.atguigu.day03;

public class Work{
    public static void main(String[] args){
        //1、实现判断一个整数，属于哪个范围：大于0；小于0；等于0
        int num1 = -1;
        if(num1 > 0 ){
            System.out.println("大于0");
        }else if(num1 == 0) {
            System.out.println("等于0");
        }else{
            System.out.println("小于0");
        }
    }
}