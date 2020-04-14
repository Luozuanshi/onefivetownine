package com.atguigu.day07OOP;

public class Method {
    public static void main(String[] args){
        Person p1 = new Person();
        Car car1 = new Car();
        car1.carName = "奥迪" ;
        p1.name = "jack";
        p1.age = 20;
        p1.car = car1;
        p1.speak(p1.name,p1.age,p1.car);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.car);
    }

}

class Person{
    public String name;
    public int age;
    Car car;


    public void speak(String name1,int age1,Car car){
        name ="hello";
        age = 10;
        car.carName ="奥拓";
    System.out.println(name+" "+age+" "+car);

    }
}

class Car {
    String carName;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}