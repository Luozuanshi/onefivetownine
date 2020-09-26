package com.domoyun.fib;

/**
 * 计算1+2+3+4+5+6+...+n的和
 */
public class Accumulate {

    public static Long sum1(int n){
        Long result = 0L;
        for (int i = 0; i < n; i++) {
             result+=i;
        }
        return result;
    }

    public static Long sum2(int n){
        return Long.valueOf((1+n) * n /2);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sum1(10000000);
        long end = System.currentTimeMillis();
        System.out.printf("算法1耗时%s\n",end-start);

        start = System.currentTimeMillis();
        sum2(10000000);
        end = System.currentTimeMillis();
        System.out.printf("算法2耗时%s\n",end-start);
    }

}
