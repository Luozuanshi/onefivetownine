import java.util.*;
public class Day04Work3{
    public static void main(String[] args){
        //3：输出小写的a-z以及大写的Z—A //for
        char a = 'a';
        //输出a-z
        for (int i=1;i<=26;i++){
            System.out.print((char)a );
            a+=1;
        }
        a='a'; //重置字符a
        System.out.println();//输出换行
        //输出A-Z
        for(int i = 1; i <= 26 ; i++ ){ 
            System.out.print((char)(a-32));
            a+=1;
        }

    }
}