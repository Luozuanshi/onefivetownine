package src.main.java.com.atguigu.day07OOP;
/**
 * @Description:    四、定义方法，实现更改某本书的价格，具体：如果价格>150,则更改为150，如果价格>100,更改为100，否则不变
 * @Author:         pangluo
 * @CreateDate:     2019年12月8日16:17:58
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月8日16:17:58
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work6 {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setPrice(150);
        book1.showInfo();

    }



}
class Book{
    private double price;

    public void setPrice(double price){
        this.price = price;
    }

    public void showInfo(){
        if(price<0){
            System.out.println("price不能设置小于0");
            return;
        }else if(price>150){
            this.price = 150;
        }else if(price>100 && price <=150){
            this.price = 100;
        }
        System.out.println(price);
    }
}

