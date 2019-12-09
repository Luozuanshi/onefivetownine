package src.main.java.com.atguigu.day08OOP;
/** 将对象作为参数传递给方法。
 * @Description:    （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 * 		public void printAreas(Circle c, int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 * 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
 * @Author:         pangluo
 * @CreateDate:     2019年12月9日19:38:56 
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月9日19:38:56 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day08Work1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle();
        circle.radius = 2;
        circle2.radius = 3;
        PassObject obj = new PassObject();

        //接收Circle对象作为参数，方法内部未改变circle对象值的操作
        obj.printAreas(circle,5);
        System.out.println(circle.radius);

        obj.printAreas(circle2,6);
        System.out.println(circle2.radius);


    }

}

class Circle{
    double radius;

    //这个方法不改变对象本身属性
    public double findArea(double radius){
        double area = 3.1415926*radius*radius;
//        System.out.println("面积为："+area);
        return area;
    }
}

class PassObject{
    //接收一个Circle对用，调用其findArea方法根据半径求出对应圆的面积
    public void printAreas(Circle c,int time){
        System.out.println("Radius"+"\tArea");
        for(int i = 1;i<=time;i++){
            System.out.print(i+"\t"+c.findArea(i));
            System.out.println();
        }
    }

}