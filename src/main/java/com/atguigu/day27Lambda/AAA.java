package com.atguigu.day27Lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class AAA {
    /**
     * 多个参数，只有一条执行语句 ，return 和大括号都可以省略
     */
    @Test
    public void test4(){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        Comparator<String> c = (o1, o2) -> {return -1;};
        TreeSet set = new TreeSet(c);
        set.add("111");
        set.add("333");
        set.add("222");
        set.add("444");
        set.add("555");
        System.out.println(set);
    }

    /**
     * 有两个参数，有多条执行语句，有返回值
     */
    @Test
    public void test3(){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        Comparator<String> comparator1 = (o1, o2) -> {
            System.out.println("CCC");
            return -1;
        };

    }

    /**
     * 有一个参数
     */
    @Test
    public void test2(){
        Consumer<String> consumer = new Consumer<String>() {

            @Override
            public void accept(String s) {

            }
        };

        //
        Consumer<String> consumer1 = s -> System.out.println("11");
    }

    /**
     * 无参数无返回值
     */
    @Test
    public void test(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("错错错 ");
            }
        };

        //lambda
        Runnable r2 = () -> System.out.println("cccc");
    }
}
