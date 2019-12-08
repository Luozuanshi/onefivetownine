package com.atguigu.day07OOP;
/**
 * @Description:    一、定义方法，实现打印九九乘法表
 * @Author:         pangluo
 * @CreateDate:     2019年12月8日12:27:44 
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月8日12:27:44 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work3 {
    public static void main(String[] args) {
        multipliccation();
    }

    public static void multipliccation(){
        //打印99乘法表
        for(int i = 1;i<10;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
