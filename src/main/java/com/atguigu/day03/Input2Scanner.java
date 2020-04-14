package com.atguigu.day03;

import java.util.*;
public class Input2Scanner{
    public static void main(String[] args){
        //�ӿ���̨�����û����յ��û���Ϣ[����,����,нˮ]
        Scanner myscanner = new Scanner(System.in);
        System.out.println("�������û���");
        String name = myscanner.next();
        
        System.out.println("����������");
        int age = myscanner.nextInt();

        System.out.println("������нˮ");
        Double salary = myscanner.nextDouble();

        System.out.println("�û��������Ϣ����:");
        System.out.println("������:"+name);
        System.out.println("������:"+age);
        System.out.println("нˮ��:"+salary);

    }
}