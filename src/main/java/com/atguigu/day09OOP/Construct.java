package com.atguigu.day09OOP;
/**
 * @Description:    构造器的课堂练习
 * @Author:         pangluo
 * @CreateDate:     2019年12月10日11:26:48 
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月10日11:26:48 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Construct {
        public static void main(String[] args){
            House house1 = new House("北京",1800000);
            house1.showInfo();

            House house2 = new House();
            house2.showInfo();
        }
}

class House{
    double price;
    String inAddress;
        House(){
            this.price = 180000;
        }
        House(String inAddress,double price){
            this.price =price;
            this.inAddress = inAddress;
        }

        public void showInfo(){
            System.out.println(this.price +"\t"+this.inAddress);
        }
}
