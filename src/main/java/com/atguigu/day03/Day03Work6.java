import java.util.*;
public class Day03Work6{
    public static void main(String[] args){
    //【选作】4、实现对三个整数进行排序，输出时按照从小到大的顺序输出。
        int a = 40, b = 20, c = 30;
        int temp =0;
        if(a>b){
            temp=a;
            a = b;
            b =temp;
            
        }
        if (a>c){
            temp = a;
            a = c;
            c = temp;
        }else if (b>c){
            temp = b;
            b = c;
            c =temp;
        }
       System.out.println(a+" "+b+" "+c);
    }
     
}
