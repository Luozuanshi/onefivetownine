public class Day05Work6{
    public static void main(String[] args){
        /**
        【嵌套循环】
        1. 输出100以内的所有素数(只能被1和自己整除的数)，每行显示5个；并求和。
         */
       
        int sum =0;
        label1:
        for(int i = 2;i<=100; i++){
            for(int j=1;j<=i;j++){
                 if( (i % j == 0)  ){  //
                continue label1;
                    
                // sum+=i;
                //  }if(i % 5 == 0){                
                //      // System.out.print(" = "+ sum);
                //      System.out.println();
                //      // sum=0;
                //  }
            }
            System.out.print(i);


             

        }
        
    }
}
}
