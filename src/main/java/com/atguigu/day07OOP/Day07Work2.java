package com.atguigu.day07OOP;
/**
 * @Description: 3、设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。
 * 并创建对象，进行测试、【提示 this.属性 】
 * @Author:         pangluo
 * @CreateDate:     2019年12月8日11:39:48 
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月8日11:39:48 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();//创建对象
        dog1.name = "二哈";//对象属性初始化
        dog1.age = 21;
        dog1.color = "黄色";

        dog1.show();//对象方法

    }
}
class Dog{
    String name;//不带修饰符默认为protect成员变量
    String color;
    int age;

    public void show(){
        System.out.println("姓名:"+this.name+"\t颜色:"+this.color+"\t年龄:"+this.age);//this->当前对象
    }
}