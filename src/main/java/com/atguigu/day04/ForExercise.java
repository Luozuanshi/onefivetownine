package com.atguigu.day04;

import java.util.*;
public class ForExercise{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int count = X;
        for(int i = 0,j = X;i<X+1;i++,j--){
            
            System.out.println(i + "+" + j +"= "+count);
        }
    }
}