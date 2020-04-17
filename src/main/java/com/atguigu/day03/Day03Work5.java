package com.atguigu.day03;

public class Day03Work5{
    public static void main(String[] args){
    //【选作】3、有两个数a和b，如果a能被b整除或者a加b大于1000，则输出a；否则输出b。
        int a =200;
        int b =20;
        if(a%b==0 || a+b>1000){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    
    }
}