package com.atguigu.day05;

public class Day05Work6{
    public static void main(String[] args){
        /**
        【嵌套循环】
        1. 输出100以内的所有素数(只能被1和自己整除的数)，每行显示5个；并求和。
         */
       
        int sum =0;
        int count =0;
        label1:
        for(int i = 2;i<=100; i++){
            for(int j=2;j<i;j++){
                 if( (i % j == 0)  ){  //当前i存在其他可以除进的数则跳出当前循环,执行下一次i循环
                continue label1;

            }else if(j==i-1){ //判断当前是否是i的前一个数,确保最后一次输出
                     System.out.print(i+"\t");
                count++;
            }

        }   //五个素数换一行
            if(count % 5 == 0){
                System.out.println();
            }
    }
}
}
