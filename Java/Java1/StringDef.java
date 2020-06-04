// StringDef.java
import java.util.Arrays;

public class StringDef {
  public static void main(String args[]){
	char c1[] = {'a','b','c','d','e'};
	String s1 = "Hello";                // 建立字符串:Hello
	String s2 = new String("World");    // 建立字符串 :World
	String s3 = new String(c1); 	    // 从数组建立字符串。abcde 
	String s4 = new String(c1,1,3);     // 从数组建立字符串。bcd 
	String s5[]={"This", "is", "a", "test."}; // 字符串数组 
	String s6 = s1.concat(s2); 	    // 字符串并置。HelloWorld 
	String s7 = s1 + s2; 		    // 字符串并置。 HelloWorld 
	boolean b1 = s1.equals(s2); 	    // 字符串(内容)是否相等
	boolean b2=s1.equalsIgnoreCase("hello"); // 相等比较，忽略大小写.true 
	boolean b3 = (s1==s2); 		    // 是否同一个对象 
	boolean b4 = s1.isEmpty(); 	    // 是否为空串。与equals("")相同 
	int len = s1.length(); 		    //字符串长度。 5 
	String s8 = Arrays.toString(s5);    //把数组元素变为逗号隔开的字符串
		
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
