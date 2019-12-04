import java.util.*;
public class Work6{
    public static void main(String[] args){
        //判断一个整数是偶数还是奇数。if-else
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}