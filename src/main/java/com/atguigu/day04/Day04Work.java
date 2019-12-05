import java.util.*;
public class Day04Work{
    public static void main(String[] args){
        //1.输出1-100之间的不能被5整除的数，每5个一行。
        int count =0;
        for(int i = 1; i<=100;i++){
            
            if((i%5) != 0){
                count++; 
                System.out.print(i+"\t"); //不能被整除的数
            }
            if((count%5) == 0){ //每五个
                System.out.println();  
            }
           
        }
    }
}