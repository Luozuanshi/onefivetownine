package src.main.java.com.atguigu.day06;
/**
 * @Description:    java����������
 * @Author:         pangluo
 * @CreateDate:     2019��12��6��18:45:12
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019��12��6��18:45:12 
 * @UpdateRemark:   ð�������㷨
 * @Version:        1.0
 */
public class Workday01 {
    public static void main(String[] args){
        //ð������
        //����1:ǰһ�����ͺ�һ�����Ƚ�
        //����2:������ں�һ����,������������λ��
        //����3:��һ��ѭ��,��j=0������������ array.length- 1 -i(ÿ����һ�ζ���һ��ѭ������)��
        //����4:�ڶ���ѭ��,��i=0��������3 array.length��

        int[] array = {1,2,4,8,2,3};//��Ҫ���������

        int temp = 0;//������������������ʱ����
        for(int i = 0;i<array.length;i++){ //ѭ�� 5 �� ,i��ε���
            for(int j = 0;j< array.length- 1 -i;j++){ //�����鳤��array.length ѭ��,ÿһ�ζ���ѭ��һ�� i(1,2,3...��������)
                if(array[j] > array[j+1] ){ //ǰһ�����ͺ�һ�����Ƚ�,������ڽ���
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        //��ӡ���
        for(int i = 0;i< array.length;i++){
            System.out.print(array[i]);
        }

    }

}
