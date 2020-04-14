package com.domoyun.interViewQueTopic.RecursionAndLoop;

import org.junit.Test;

/**
 * 项目名称：interViewQueTopic 类名称：RecursionAndLoop
 *
 * @author Administrator
 * @version 1.0 创建时间2020年4月14日 22:23:23
 * 	类描述 ： 递归和循环
 *编程题：有n步台阶，一次只能上1步或2步，共有多少种走法？
 */

public class RecursionAndLoop {
    //使用递归方式
    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        System.out.println(Resursion(40));
        System.out.println(System.currentTimeMillis() -start);
    }

    public static Integer Resursion(Integer n){
        if (n == 1 || n == 2){
            return n;
        }
        return Resursion(n-2)+Resursion(n-1);
    }

    //使用循环方式
    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        System.out.println(Loop(4));
        System.out.println(System.currentTimeMillis() -start);
    }

    public static Integer Loop(Integer n){
        if (n == 1 || n == 2){
            return n;
        }
        int one =2;
        int two =1;
        int sum=0;


        //one:最后走一步比最后走两步多一种方法
        //tow:最后走两步
        //f(x-2)+f(x-1)
        //从3开始
        for (int i=3;i<=n;i++){
            sum = two + one ;
            two = one;
            one =sum;
        }
        return sum;
    }
}
