package com.atguigu.day04;

public class Day04Work6{
    public static void main(String[] args){
      // 4：求出1-1/2+1/3-1/4…..1/100的和 [动脑]
        //1-1/2+1/3-1/4+1/5
        int sum =0;
        for(int i = 1;i<=100;i++){
            if(i % 2 == 0){
                sum -=1/i;
            }else{
                sum +=1/i;
            }
            
        }
        System.out.println(sum);
    }
}

//0+1-1/2+