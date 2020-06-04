// DataConversion.java
public class DataConversion {
  public static void main(String args[]){
	  int i = 123456;	
	  System.out.println(""+i);                      // 把i转化为字符串
	  System.out.println(Integer.toString(i));       // 把i转化为字符串     
	  System.out.println(Integer.toBinaryString(i)); // 转化为二进制字符串:11110001001000000
	  System.out.println(Integer.toHexString(i));    // 转化为十六进制字符串：1e240
	  System.out.println(Integer.toString(i, 16));   // 转化为十六进制：1e240
	  System.out.println(Integer.MAX_VALUE);         // 最大整数：2147483647
	  int j=Integer.reverse(i);           // i的二进制(32位)的逆转:38240256
	  System.out.println(j);                         //    10010001111000000000000000
	  System.out.println(String.format("%08d", i));  // 按格式转换：00123456(不够8位前面添0)
	  String s1="567890";	
	  i = Integer.parseInt(s1);     //把字符串s1转换为整数
	  i = Integer.parseInt(s1,16);  //   转换为16进制整数
	  i = Integer.valueOf(s1);      //把字符串s1转换为整数
	  i = Integer.valueOf(s1,16);   //转换为16进制整数	
	  float f = 1234.0f;
	  System.out.println(""+f);                       //把浮点数s1转换为字符串
	  System.out.println(Float.toString(f));          //把浮点数s1转换为字符串 
	  System.out.println(String.format("%010.3f",f)); //按格式转换：001234.568(共10位)
	  f = Float.valueOf("4567.789");       //把字符串转换为浮点数
  }
}
