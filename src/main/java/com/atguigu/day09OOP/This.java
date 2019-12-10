package com.atguigu.day09OOP;
/**
 * @Description:    this的课堂练习
 * @Author:         pangluo
 * @CreateDate:     2019年12月10日11:26:48 
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月10日11:26:48 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class This {
        public static void main(String[] args){
            Person p1 = new Person();
            boolean isTrue =  p1.compareTo(p1);
            Person p2 = new Person();
            p2.name = "李四";
            isTrue = p1.compareTo(p2);
            System.out.println(isTrue);
        }
}
class Person{
    String name;
    int age;

    Person(){
    name ="张山";
    age = 20;
    }

    public boolean compareTo(Person p){
        if(p.name.equals(this.name) && p.age == this.age){//看到this可以理解成当前对象与传进来的对象 比较  例如说 p1.compareTo(p2);
            return true;
        }else{
            return false;
        }
    }

}
