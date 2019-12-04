import java.util.*;
public class Work6{
    public static void main(String[] args){
    //【选作】4、实现对三个整数进行排序，输出时按照从小到大的顺序输出。
       int a =10,b=20,c=30;
       int max = a > b ? a : b ;
        System.out.println(a+" "+b);
        int max1 = max > c ? max : c ;
        
       System.out.println(max+" "+max1);
    }
}