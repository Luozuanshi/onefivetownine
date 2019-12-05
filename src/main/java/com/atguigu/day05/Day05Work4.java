import java.util.*;
public class Day05Work4{
    public static void main(String[] args){
        /**
            2. 随机猜数游戏： [选做]
                随机生成一个1——100的整数 
                有十次机会 
                如果第一次就猜中，提示 “你真是个天才” 
                如果第2——3次猜中，提示“你很聪明，赶上我了” 
                如果第4——9次猜中，提示“一般般” 
                如果最后一次猜中，提示“可算猜对啦” 
                一次都没猜对，提示“说你点啥好呢” 
                【嵌套循环】
                1. 输出100以内的所有素数(只能被1和自己整除的数)，每行显示5个；并求和。
         */
        //生成一个100以内的整数   
        int random = (int)(Math.random()+1);
        System.out.println(random);
        //机会次数
        int count =0;
        //接收用户输入的数
        Scanner in = new Scanner(System.in);

        for (int i = 1;i<=10;i++){
           count++;
           int useRandom = in.nextInt();
           if(useRandom == random){
           switch(count){
               case 1:
                System.out.println("你真是个天才");
                break;
               case 2:
               case 3:
                System.out.println("你很聪明,赶上我了");
                break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                System.out.println("一般般");
                break;
                default :
                System.out.println("可算猜对啦");
           } 
           break;
           }else{
               continue;
           }
          
           
        }
    }
}
