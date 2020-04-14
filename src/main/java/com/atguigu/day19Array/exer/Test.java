/**
 * 
 */
package com.atguigu.day19Array.exer;

/**
   * 项目名称：domo
   *类名称：Test
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月24日下午9:26:46
   * 类描述
 */
public class Test {
	public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();
        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }

}
class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}
class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
