// StringDef.java
import java.util.Arrays;

public class StringDef {
  public static void main(String args[]){
	char c1[] = {'a','b','c','d','e'};
	String s1 = "Hello";                // �����ַ���:Hello
	String s2 = new String("World");    // �����ַ��� :World
	String s3 = new String(c1); 	    // �����齨���ַ�����abcde 
	String s4 = new String(c1,1,3);     // �����齨���ַ�����bcd 
	String s5[]={"This", "is", "a", "test."}; // �ַ������� 
	String s6 = s1.concat(s2); 	    // �ַ������á�HelloWorld 
	String s7 = s1 + s2; 		    // �ַ������á� HelloWorld 
	boolean b1 = s1.equals(s2); 	    // �ַ���(����)�Ƿ����
	boolean b2=s1.equalsIgnoreCase("hello"); // ��ȱȽϣ����Դ�Сд.true 
	boolean b3 = (s1==s2); 		    // �Ƿ�ͬһ������ 
	boolean b4 = s1.isEmpty(); 	    // �Ƿ�Ϊ�մ�����equals("")��ͬ 
	int len = s1.length(); 		    //�ַ������ȡ� 5 
	String s8 = Arrays.toString(s5);    //������Ԫ�ر�Ϊ���Ÿ������ַ���
		
	System.out.println("s1="+s1);        
	System.out.println("s2="+s2);
	System.out.println("s3="+s3);
	System.out.println("s4="+s4);
	System.out.println("s5="+s5);      
	System.out.println("s6="+s6);
	System.out.println("s7="+s7);
	System.out.println("s8="+s8);
	System.out.println("b1="+b1);
	System.out.println("b2="+b2);
	System.out.println("b3="+b3);
	System.out.println("b4="+b4);
	System.out.println("len="+len);
  }
}
