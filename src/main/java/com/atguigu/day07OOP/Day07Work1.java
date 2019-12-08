package com.atguigu.day07OOP;
/**
 * @Description: 2、编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示)
 * 并创建两个对象，分别测试
 * @Author:         pangluo
 * @CreateDate:     2019年12月8日11:07:28
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月8日11:07:33
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work1 {
    public static void main(String[] args) {
        Calc calc = new Calc();//实例化对象
        calc.number1 =1;//初始化对象属性
        calc.number2 =8;
        double resultSum = calc.sum(calc.number1,calc.number2);//调用对象方法
        double resultSubduction = calc.subduction(calc.number1,calc.number2);
        double resultMul = calc.mul(calc.number1,calc.number2);
        double resultDivision = calc.division(calc.number1,calc.number2);

    }

}

class Calc{
    double number1 ;//类的成员变量
    double number2 ;

    //类的成员方法
    public double sum(double number1,double number2){
        double sum = number1 + number2;
        System.out.println("加:"+number1+"+"+number2+"="+sum);
        return sum;
    }

    public double subduction (double number1,double number2){
        double subduction = number1 - number2;
        System.out.println("减:"+number1+"-"+number2+"="+subduction);
        return subduction;
    }

    public double mul (double number1,double number2){
        double mul = number1 * number2;
        System.out.println("乘:"+number1+"*"+number2+"="+mul);
        return mul;
    }

    public double division(double number1,double number2){
        if(number1 == 0){
            System.out.println("除数不能为零");
            return 0;
        }
        double division = number1 / number2 ;
        System.out.println("除:"+number1 +"/"+ number2 +"="+division);
        return division;
    }
}
