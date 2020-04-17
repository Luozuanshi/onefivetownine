package com.atguigu.day04;

import java.util.Scanner;

public class Day04Work8{
    public static void main(String[] args){
        //
        String name = "";
        int pwd = 123;
        Scanner in = new Scanner(System.in);
        
        for(int i = 3;i>0;i--){
            System.out.println("请输入用户名");
            name = in.next();
             System.out.println("请输入密码");
            pwd = in.nextInt();
            if("张无忌".equals(name) && pwd == 888 ){
                break;
            }else{
                System.out.println("你还有"+i+"次机会");
            }

        }
        
    }
}
