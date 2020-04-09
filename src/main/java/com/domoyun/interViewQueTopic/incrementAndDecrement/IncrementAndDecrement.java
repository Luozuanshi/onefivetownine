package com.domoyun.interViewQueTopic.incrementAndDecrement;

import org.junit.Test;

/**
 * 项目名称：interViewQueTopic 类名称：IncrementAndDecrement
 *
 * @author Administrator
 * @version 1.0 创建时间2020年4月9日 11:44:05
 * 	类描述 ： 关于自增自减的面试题
 * 	1.++i先把i的值+1，再压入到操作数栈，再运算 ；i++，先把i的值压入到操作数栈,再运算.
 * 	2.i=i++; 即为 先把i压入到操作数栈，在运算，再把操作数赋值给i
 *
 */
public class IncrementAndDecrement {

    @Test
    public void preIncrement(){
        int i = 1;
        i = ++i;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }

    @Test
    public void postIncrement(){
        int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }



}
