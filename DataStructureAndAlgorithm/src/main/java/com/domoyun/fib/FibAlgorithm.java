package com.domoyun.fib;

/**
 * 斐波那契
 */
public class FibAlgorithm {


    /** 斐波那契数
     * 0 1 1 2 3 5 8 13 21 34
     */

    public static Long fib1(int n){
        if (n <= 1){
            return Long.valueOf(n);
        }
        return fib1(n-1)+fib1(n-2);
    }

    public static Long fib2(int n){
        if (n<=1){
            return Long.valueOf(n);
        }

        Long first = 0L ;
        Long second = 0L;

        for (int i = 0; i < n - 1; i++) {
            Long sum = first+second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        fib1(32);
        long end = System.currentTimeMillis();
        System.out.printf("算法1耗时%s",end-start);

        start = System.currentTimeMillis();
        System.out.println(fib1(32));
        end = System.currentTimeMillis();
        System.out.printf("算法2耗时%s\n",end-start);



    }
}
