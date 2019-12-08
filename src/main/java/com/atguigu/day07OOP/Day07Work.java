package src.main.java.com.atguigu.day07OOP;
/**
 * @Description: 1.定义一个圆类型
 * 	定义属性：半径
 * 提供显示圆周长功能的方法
 * 提供显示圆面积的方法
 * @Author:         pangluo
 * @CreateDate:     2019年12月7日20:54:38
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月7日20:54:38
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 1;
        c.perimeter(c.radius) ;
        c.area(c.radius);
    }

}
class Circle{
    public double radius;//半径
    public static final double pi = 3.1415926;

    public double perimeter(double radius){
        double perimet = 2 * pi * radius;
        System.out.println("周长是"+perimet);
        return perimet;
    }

    public double area(double r){
        double areaO = pi * r * r;
        System.out.println("面积是"+areaO);
        return areaO;
    }
}