package src.main.java.com.atguigu.day09OOP;
/**
 * @Description:    请编写一个猜拳的游戏
 * 有个人 Tom 设计他的成员变量. 成员方法, 可以电脑猜拳. 电脑每次都会随机生成 0, 1, 2
 * 0 表示 石头 1 表示剪刀 2 表示 布
 * 并要可以显示 Tom的输赢次数（清单）.
 * @Author:         pangluo
 * @CreateDate:     2019年12月10日19:50:03
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月10日19:50:06
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
import java.util.*;
public class day09Work03 {
    public static void main(String[] args){
        Person tom = new Person();
        Computer com = new Computer();

        Scanner in  = new Scanner(System.in);
        int oK =0 ; //控制菜单是否继续

        do{
            System.out.println("2打印清单 3结束");
            oK = in.nextInt();
            //控制菜单是否继续
            if(oK==2){
                System.out.println(com.resultList());
                continue;
            }else if(oK==3){
                break;
            }

            tom.chuquan();//tom出拳
            com.computerChuquan(tom);//和电脑比对
        }while(true);


    }

}

class Person{
    String name = "Tom";
    int personChuquan; //出拳结果

    //出拳并返回结果
    public int chuquan(){
        tomChuquan= (int)(Math.random() *3 + 1);
        return tomChuquan ;
    }
}
class Computer{
    int winCount;//电脑赢的次数
    int pingshouCount;//平手赢的次数
    int TomWinCount;//Tom赢的次数
    String personChuquanVal;//Tom的出拳结果 用于输出

    public int computerChuquan(Person tom){
        int computerChuquan =(int)(Math.random() *3 + 1);//电脑出拳
        //拿到Tom 的出拳结果 用作输出
        switch(tom.tomChuquan){
            case 0:
                tomChuquanVal = "石头";
                break;
            case 1:
                tomChuquanVal = "剪刀";
                break;
            case 2:
                tomChuquanVal = "布";
                break;
        }
        //判断并把结果计数
        switch(computerChuquan){
            case 0:
                if(tom.tomChuquan!= 2 && tom.tomChuquan !=0)winCount++;
                else if(tom.tomChuquan ==0)pingshouCount++;
                else TomWinCount++;
                System.out.println("电脑出了石头，Tom出了"+tomChuquanVal);
            break;
            case 1:
                if(tom.tomChuquan!= 0 && tom.tomChuquan !=1)winCount++;
                else if(tom.tomChuquan ==1)pingshouCount++;
                else TomWinCount++;
                System.out.println("电脑出了剪刀，Tom出了"+tomChuquanVal);
                break;
            case 2:
                if(tom.tomChuquan!= 1 && tom.tomChuquan !=2)winCount++;
                else if(tom.tomChuquan ==2)pingshouCount++;
                else TomWinCount++;
                System.out.println("电脑出了布，Tom出了"+tomChuquanVal);
                break;
            default:
                return winCount;
        }
        //返回电脑的出拳结果
        return computerChuquan;
    }
    //打印结果清单
    public String resultList(){
        return "电脑赢了："+winCount+"次"+"和电脑平手："+pingshouCount+"Tom赢了："+TomWinCount;
    }
}