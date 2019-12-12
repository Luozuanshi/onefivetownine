package com.atguigu.day04;

import java.util.*;
public class Day04Work{
    public static void main(String[] args){
        //1.���1-100֮��Ĳ��ܱ�5����������ÿ5��һ�С�
        int count =0;
        for(int i = 1; i<=100;i++){
            
            if((i%5) != 0){
                count++; 
                System.out.print(i+"\t"); //���ܱ���������
            }
            if((count%5) == 0){ //ÿ���
                System.out.println();  
            }
           
        }
    }
}