package src.main.java.com.atguigu.WorkExer;

import java.util.Scanner;

public class EnumExer {






        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("今天是星期几(1-7)：");
            int number = input.nextInt();//假设输入的是2
            Week w = Week.getByNumber(number);
            System.out.println("今天是：" + w);//今天是：TUESDAY(2,星期二)
        }



}
enum Week{
    MONDAY(1,"星期一"),TUESDAY(2,"星期二"),
    WEDNESDAY(3,"星期三"),THURSDAY(4,"星期四"),FRIDAY(5,"星期五"),
    SATURDAY(6,"星期六"),SUNDAY(7,"星期天");
    private int number;
    private String description;

    Week(int number, String description){
        this.number = number;
        this.description = description;
    }



    public static Week getByNumber(int number) {

        switch(number){
            case 1:
                return MONDAY;
            case 2:
                return THURSDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default :
                return null;


        }

    }

    @Override
    public String toString() {
        return "Week{" +
                "number=" + number +
                ", description='" + description + '\'' +
                '}';
    }
}