package com.atguigu.day27Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

public class CCC {
    static ArrayList<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee("aaa", 18, 2000));
        list.add(new Employee("cccccc", 20, 5000));
        list.add(new Employee("ddddd", 25, 6000));
        list.add(new Employee("ff", 30, 8000));
        list.add(new Employee("bbb", 35, 3000));
    }

    @Test
    public void test(){
        boolean b = list.stream().allMatch(e -> e.getAge() > 17);
        System.out.println(b);

        boolean b1 = list.stream().anyMatch(employee -> employee.getAge() > 34);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(e -> e.getAge() < 17);
        System.out.println(b2);

        Optional<Employee> first = list.stream().findFirst();
        System.out.println(first.get());

        long count = list.stream().count();
        System.out.println(count);

        Optional<String> s = list.stream().map(e -> e).max((o1, o2) -> o1.getSalary() - o2.getSalary()).map(employee -> employee.getName());
        System.out.println(s.get());

        Optional<String> s1 = list.stream().min(((o1, o2) -> o1.getSalary() - o2.getSalary())).map(employee -> employee.getName());
        System.out.println(s1.get());


    }

    /**
     * reduce
     */
    @Test
    public void test2(){
        Optional<Integer> reduce = list.stream().map(employee -> employee.getSalary()).reduce((a, b) -> a + b);
        System.out.println(reduce.get());

        System.out.println("-----------------------------");

        Optional<String> reduce1 = list.stream().map(employee -> employee.getName()).reduce((a, b) -> a + b);
        System.out.println(reduce1.get());
    }

    @Test
    public  void test3(){

    }

}
