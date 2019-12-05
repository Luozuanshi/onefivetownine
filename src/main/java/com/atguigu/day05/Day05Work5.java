import java.util.*;
public class Day05Work5{
    public static void main(String[] args){
        /**
         * 【选作】5. 中国有句俗语叫“三天打鱼两天晒网”。如果从1990年1月1日起开始执行“三天打鱼两天晒网”。如何判断在以后的某一天中是“打鱼”还是“晒网”？
         */
        //1.判断有多少年有多少天 判断是否是闰年
        //2.判断有多少月有多少天
        //3.判断有多少日有多少天
        //统计年月日一共有多少天

        int years=1991,month=1,days=1,totaldays=0;
        for(int i = 1 ;i<=(years-1990);i++ ){
            if(isRyears(i)==true){
                totaldays+=366;
            }else{
                totaldays+=365;
            }
        }
        System.out.println(totaldays);
        totaldays+=hasMonthDay(years,month,days);
        System.out.println(totaldays);
        totaldays-=days;
        System.out.println(totaldays);

        switch(totaldays%5){
            case 0:
                System.out.println("今天打鱼");
                break;
            case 1:
                System.out.println("今天打鱼");
                break;
            case 2:
                System.out.println("今天打鱼");
                break;
            case 3:
                System.out.println("今天晒网");
                break;
            case 4:
                System.out.println("今天晒网");
        }
    }

    public static boolean isRyears(int years) {
        if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
            System.out.println(years);
            return true;
        }
        return false;
    }

    public static int hasMonthDay(int years,int month,int days1){
        int days =0;
        int i = 1;
        while(i<=month){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(i==month){
                        days = days + days1;
                    }else{
                        days = days + 31;
                    }
                    break;
                case 2:
                    if((years % 4 == 0) && (years % 100 != 0) || years % 100 == 0 ){
                        if(i==month){
                            days = days + days1;
                        }else{
                            days = days + 29;
                        }

                        System.out.println(days);
                    }else{
                        if(i==month){
                            days = days + days1;
                        }else{
                            days = days + 28;
                        }
                        System.out.println(days);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(i==month){
                        days = days + days1;
                    }else{
                        days = days + 30;
                    }
                    System.out.println(days);

                    break;
            }
            i++;
        }

        System.out.println(days-31);//减31是 1月0天 代表0天 1月31天才代表31天,所以减去一个31
        return days;
    }
}
