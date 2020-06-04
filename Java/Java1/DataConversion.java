// DataConversion.java
public class DataConversion {
  public static void main(String args[]){
	  int i = 123456;	
	  System.out.println(""+i);                      // ��iת��Ϊ�ַ���
	  System.out.println(Integer.toString(i));       // ��iת��Ϊ�ַ���     
	  System.out.println(Integer.toBinaryString(i)); // ת��Ϊ�������ַ���:11110001001000000
	  System.out.println(Integer.toHexString(i));    // ת��Ϊʮ�������ַ�����1e240
	  System.out.println(Integer.toString(i, 16));   // ת��Ϊʮ�����ƣ�1e240
	  System.out.println(Integer.MAX_VALUE);         // ���������2147483647
	  int j=Integer.reverse(i);           // i�Ķ�����(32λ)����ת:38240256
	  System.out.println(j);                         //    10010001111000000000000000
	  System.out.println(String.format("%08d", i));  // ����ʽת����00123456(����8λǰ����0)
	  String s1="567890";	
	  i = Integer.parseInt(s1);     //���ַ���s1ת��Ϊ����
	  i = Integer.parseInt(s1,16);  //   ת��Ϊ16��������
	  i = Integer.valueOf(s1);      //���ַ���s1ת��Ϊ����
	  i = Integer.valueOf(s1,16);   //ת��Ϊ16��������	
	  float f = 1234.0f;
	  System.out.println(""+f);                       //�Ѹ�����s1ת��Ϊ�ַ���
	  System.out.println(Float.toString(f));          //�Ѹ�����s1ת��Ϊ�ַ��� 
	  System.out.println(String.format("%010.3f",f)); //����ʽת����001234.568(��10λ)
	  f = Float.valueOf("4567.789");       //���ַ���ת��Ϊ������
  }
}
