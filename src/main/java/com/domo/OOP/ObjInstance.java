/**
 * 
 */
package com.domo.OOP;

/**
   * 项目名称：domo
   *类名称：ObjInstance
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月2日下午12:07:26
   * 类描述:面向对象实例
   * 一个java文件 可以有多个类，但是只能有一个public 修饰的类
   * https://www.bilibili.com/video/av38535311/?p=64 _内存分析详解_栈_堆_方法区_栈帧_程序执行的内存变化过程
 */
class Computer {
    String brand;  //品牌
}
public class ObjInstance {
    // field
    int id;
    String sname;
    int age;
    Computer comp;
    void study() {
        System.out.println("我正在学习！使用我们的电脑，"+comp.brand);
    }
    ObjInstance() {
    }
    public static void main(String[] args) {
        ObjInstance stu1 = new ObjInstance();
        stu1.sname = "张三";
        Computer comp1 = new Computer();
         comp1.brand = "联想";
        stu1.comp = comp1;
        stu1.study();
    }
}
