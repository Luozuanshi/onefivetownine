package com.domoyun.interViewQueTopic.GloableAndLocalvariable;

/**
 * 项目名称：interViewQueTopic 类名称：GloableAndLocalvariable
 *
 * @author Administrator
 * @version 1.0 创建时间2020年4月15日 20:25:25
 * 	类描述 ： 局部变量成员变量（实例变量，类变量）的作用域
声明的位置
    局部变量：方法体{}中，形参，代码块{}中
    成员变量：类中方法外
        类变量：有static修饰
        实例变量：没有static修饰
修饰符
    局部变量：final
    成员变量：public、protected、private、final、static、volatile、transient
值存储的位置
    局部变量：栈
    实例变量：堆
    类变量：方法区
作用域
    局部变量：从声明处开始，到所属的}结束
    实例变量：在当前类中“this.”(有时this.可以缺省)，在其他类中“对象名.”访问
    类变量：在当前类中“类名.”(有时类名.可以省略)，在其他类中“类名.”或“对象名.”访问
生命周期
    局部变量：每一个线程，每一次调用执行都是新的生命周期
    实例变量：随着对象的创建而初始化，随着对象的被回收而消亡，每一个对象的实例变量是独立的
    类变量：随着类的初始化而初始化，随着类的卸载而消亡，该类的所有对象的类变量是共享的

局部变量与实例变量重名
    在实例变量前面加“this.”
局部变量与类变量重名
    在类变量前面加“类名.”


 *
 */
public class GloableAndLocalvariable {
    static int s;
    int i;
    int j;

    {
        int i = 1;
        i++;
        j++;
        s++;
    }

    public void test(int j){
        j++;
        i++;
        s++;
    }
    public static void main(String[] args) {
        GloableAndLocalvariable g1 = new GloableAndLocalvariable();  //g1 s=1 j=1
        GloableAndLocalvariable g2 = new GloableAndLocalvariable(); //g2 s=2 j=1
        g1.test(10);//g1 s=3 i=1 j=1
        g1.test(20);//g1 s=4 i=2 j=1
        g1.test(30);//g1 s=5 i=3 j=1
        g2.test(15);//g2 s=6 i=1 j=1
        System.out.println("   i"+g1.i+"   j"+g1.j+"   s"+ s);//s=6 i=3 j=1
        System.out.println("   i"+g2.i+"   j"+g2.j+"   s"+ s);//s=6 i=1 j=1
    }
}
