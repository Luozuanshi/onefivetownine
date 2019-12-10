package com.atguigu.day09OOP;
/**
 * @Description: 方法的重载
 * 一、使用方法重载实现求三个double数的最大值，两个int的最大值
 * 二、使用方法重载实现返回 double 数组中最大值的下标和 String 数组的长度最大的元素的下标.
 * 三、使用方法重载实现使用冒泡排序完成 对 int [] 从小到大排序，和对 String[] 数组的各个元素按照 长度 从大到小排序.
 * @Author:         pangluo
 * @CreateDate:     2019年12月10日18:16:09
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月10日18:16:09 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class day09Work01 {
    public static void main(String[] args){
        NumTools tools = new NumTools();

        System.out.println(tools.sortAndMax(1.0,2.0,3.0));//三个double数的最大值
        System.out.println(tools.sortAndMax(8.0,9.0,77.0));
        System.out.println(tools.sortAndMax(9,3));//两个int的最大值

        double[] doubleArr = {1,2,3,5,7,8};

        System.out.println(tools.sortAndMax(doubleArr));//使用方法重载实现返回 double 数组中最大值的下标和

        String[] strArr = {"ni12222222","nihaos"};
        System.out.println(tools.sortAndMax(strArr));//使用方法重载实现返回 String 数组的长度最大的元素的下标.
                                                     //对 String[] 数组的各个元素按照 长度 从大到小排序.

        for(int i = 0; i<strArr.length;i++){
            System.out.print(strArr[i]+"\t");
        }

        int[] intArr = {1,2,6,45,5,74,89,6587,6,5664};
        tools.sortAndMax(intArr);

        for(int i = 0; i<intArr.length;i++){
            System.out.print(intArr[i]+"\t");
        }

    }
}

class NumTools{

    //两个double最大值
    public double sortAndMax(double a,double b){
        return a>b ? a : b;
    }
    //两个int最大值
    public int sortAndMax(int a,int b){
          return a>b ? a : b;
//        return (int)sortAndMax((int)a,(int)b);//java.lang.StackOverflowError
    }
    // double 数组中最大值的下标
    public double sortAndMax(double a,double b, double c){
        return sortAndMax(sortAndMax(a,b),c);
    }
    //使用方法重载实现返回 double 数组中最大值的下标和
    public int sortAndMax(double[] args){
        double max = 0;
        int index =0;
        for(int i = 0;i<args.length;i++){
            if(max<args[i]){
                max = args[i];
                index = i;
            }
        }
        return index;
    }

    public String[] sortAndMax(String[] args){
        int index=0;
        int maxlength= 0;
        //使用方法重载实现返回 String 数组的长度最大的元素的下标.
        for(int i = 0;i<args.length;i++){
            if(maxlength<args[i].length()){
                index=i;
            }

        }
        System.out.println(index);
        //对 String[] 数组的各个元素按照 长度 从大到小排序.
            maxlength=0;
            String temp="";
            for(int i = 0;i<args.length;i++) {
                for(int j = 0; j<args.length -1 -i;j++){
                    if(args[j].length()>args[j+1].length()) {
                        temp = args[j];
                        args[j] = args[j+1];
                        args[j+1] = temp;
                    }
                }

            }



        return args;
    }

//    使用方法重载实现使用冒泡排序完成 对 int [] 从小到大排序，和对 String[] 数组的各个元素按照 长度 从大到小排序.
    public int[] sortAndMax(int[] args) {
    	int temp =0;
    	for(int i = 0;i<args.length;i++) {
    		for(int j = 0; j<args.length -1 -i;j++){
                if(args[j]>args[j+1]) {
                    temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }

    	}
    	return args;
    }
    
    
}
