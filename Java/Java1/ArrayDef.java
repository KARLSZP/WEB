// ArrayDef.java
import java.util.Arrays;

public class ArrayDef {
  public static void main(String args[]){
         int sample34[23];
	 int sample[];                   // ����������󣬳�ʼֵΪnull
	 sample = new int[8];     		 // ����һά�������飬������洢�ռ��С��8��������
	 sample[7]=100;					 // �������÷���
	 System.out.println(sample[7]);  // ��ʾ��7��Ԫ�أ�100�����ӵ�0����ʼ,����ͬ��  
	 System.out.println(sample[0]);	 // ��ʾ��0��Ĭ��ֵ����
	
	 int rnds[];
	 rnds = new int[]{1,3,4,5,6};
	 System.out.println(Arrays.toString(rnds));//��ʾȫ������Ԫ�أ�[1,3,4,5,6]  	 
	 char[] chars = {'��', '��', '��', '��','��'};//��ʼ��һά�ַ����飬������洢�ռ��С��5���ַ���
	 System.out.println(chars[3]);			 // ��ʾ��4�����ַ����͡�
	 
	 String[] s1= {"John", "Wade", "James"}; // ��ʼ��һά�ַ�������
	 System.out.println(s1[1]);				 // ��ʾ�ӵ�1���ַ�����Wade
	 
	 int nums[] = {9, -10, 18, -978, 9, 287, 49, 7}; 
	 for(int num:nums){ 					 // ö��ѭ����
		 System.out.println(num); 			 // ��ʾ����nums��ȫ��Ԫ��
	 }
	
	 double map[][] = new double[3][10];	 // �����ά˫�������飺��3�У�ÿ��10��
	 map[0][9] = 20;
	 System.out.println(map[0][9]);
	 
	 int table[][] = {{1},{2,3,4},{5,6,7,8}};  // ��ʼ����ά���飨�ɱ䳤��
	 for(int i=0; i<table.length; i++){      // table.lengthΪ����
	   for(int j=0; j<table[i].length; j++){ // ��table[i].length�е�Ԫ�ظ���(����)
		  System.out.println(table[i][j]);   // ��ʾ��i�е�j�е�Ԫ�أ�1,2,3,4,5,6,7,8
	   }
	 }
  }
}