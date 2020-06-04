// StringOp.java
import java.util.Arrays;   //
import java.util.regex.*;
public class StringOp {
  public static void main(String args[]){
	  String s1 = "Hello";
	  char c1[]={'W','o','r','l','d'};
	  String s2 = String.copyValueOf(c1);     //把字符数组变为字符串:World		
	  String s3 = s1.toUpperCase();           //变大写字母:HELLO
	  String s4 = s1.toLowerCase();           //变小写字母:hello 
	  String s5 = s1.substring(1,4);          //求子串(第1到3个字符):ell
	  char c2 = s1.charAt(4); 	           //取第4个字符:o 
	  String[] s6 = s1.split("e"); 	           //分割字符串: "H","llo" 
	  String s7 = s1.replace("l","L");        //替换字符串(所有):heLLo。
	  String s8 = s1.replaceAll("l","L");     //替换字符串(所有):heLLo
	  String s9 = s1.replaceFirst("l","L");   //替换第一次出现:heLlo
	  String s8a = s1.replaceAll("[Hl]","L"); //替换所有字符H或l:LeLLo 
	  String s9a = s1.replaceFirst("[Hl]","L");//替换第一次出现字符H或l:Lello
	  String s10 = "   We learn Java";
	  boolean b1=s10.endsWith("Java"); 	// 以什么子串结尾:true 
	  boolean b2=s10.startsWith("We"); 	// 以什么子串开始:false 
	  String s11=s10.trim(); 		// 删除头尾空格:We learn Java

	  int i=25;
	  String s12=String.valueOf(i);     // 把整数转换为字符串
	  boolean b3=s10.contains("learn"); // 是否包含子串learn: true 
	  int pos1 = s11.indexOf("e");      // 匹配子串的索引:1.未找到返回-1.
	  int pos2 = s11.indexOf("e",3);    // 匹配子串的索引:4。从位置3开始 
	  int pos3 = s11.lastIndexOf("e");  // 从尾部往前一个匹配子串的索引:4
	  s12=String.format("%05d,%s",501,"op");//格式化字符串：00501,loop
	  String regex ="(;|,)";                //正则表达式 :;或,
	  String[] s14= "a;b,c;d".split(regex); //以;或,拆分字:"a","b","c","d" 
	  boolean b4=s11.matches("^We.*") ;     //匹配正则表达式(以We开头):true. 
	  int n1 = "abcd".compareTo("abcD");     //词典序:32  0等于<0小于>0大于 
	  int n2 = "abcd".compareToIgnoreCase("abcD"); //忽略大小写
	  byte[] bytes = s11.getBytes();        // 把字符串转变为字节数组
	
  	  String s15="";
	  try{
		//把任何编码的字符串转换成UTF-8编码
		s15 = new String(s11.getBytes("ISO-8859-1"),"UTF-8"); 
	  }
	  catch(java.io.UnsupportedEncodingException e){
			e.printStackTrace();  // 显示出错信息
	  }
  }
}
