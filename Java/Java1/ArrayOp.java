// ArrayOp.java
import java.util.Arrays;   //����������
public class ArrayOp {
  public static void main(String args[]){
	char s1[]={'H','e','l','l','o'};		 
	s1=Arrays.copyOf(s1,8);     // ���Ƴ�һ��8Ԫ������:Hello*** *Ϊnull�ַ� 
	System.out.println(s1);
	char s2[];
	s2=Arrays.copyOf(s1,5);     // ���Ƴ�һ��5Ԫ������:Hello
	System.out.println(s2);     // 
	char s3[]=Arrays.copyOfRange(s1, 1, 4); // ���Ƶ�1~3��Ԫ��:ell
	System.out.println(s3);
	Arrays.fill(s3,'a'); 		// ��s3��ȫ��Ԫ�����Ϊa
	System.out.println(s2);     // ���: aaa
	Arrays.fill(s2,2,4,'a');    // ��s2�ĵ�2~3��Ԫ�����Ϊo
	System.out.println(s1);
	boolean r = Arrays.equals(s1,s2); // �Ƚ������Ԫ�ظ�����ֵ�Ƿ����:false
	System.out.println(r);
	int pos=Arrays.binarySearch(s1,'l'); // ����ֵΪl��Ԫ��
	System.out.println(pos);
	Arrays.sort(s1);            // ����s1:***Hello   *Ϊnull
	System.out.println(s1);

	int a[]={3,5,4,26,19,2,9};
	Arrays.sort(a,1,5);         // �����1~4��Ԫ��:3,4,5,19,26,2,9
	for(int x:a){
		System.out.println(x);
	}
  }
