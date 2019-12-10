package src.main.java.com.atguigu.day09OOP;
/**
 * @Description:    可变参数 一、编写方法，可以接收个数不等的 double 值 , 返回他们的和， 最大值，最小值。
 * @Author:         pangluo
 * @CreateDate:     2019年12月10日19:44:42
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月10日19:44:42
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class day09Work02 {
    public static void main(String[] args){
       double result =sumDoubleVal(1.0,2.2,64,.4,53,34,464);
       System.out.println(result);
    }
    public static double sumDoubleVal(double... args){
        double sum= 0;
        for(int i = 0;i<args.length;i++){
            sum += args[i];
        }
        return sum;
    }
}


