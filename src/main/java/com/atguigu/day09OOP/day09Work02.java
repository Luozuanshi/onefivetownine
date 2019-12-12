package com.atguigu.day09OOP;
/**
 * @Description:    �ɱ���� һ����д���������Խ��ո������ȵ� double ֵ , �������ǵĺͣ� ���ֵ����Сֵ��
 * @Author:         pangluo
 * @CreateDate:     2019��12��10��19:44:42
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019��12��10��19:44:42
 * @UpdateRemark:   �޸�����
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


