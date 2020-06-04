// StringOp.java
import java.util.Arrays;   //
import java.util.regex.*;
public class StringOp {
  public static void main(String args[]){
	  String s1 = "Hello";
	  char c1[]={'W','o','r','l','d'};
	  String s2 = String.copyValueOf(c1);     //���ַ������Ϊ�ַ���:World		
	  String s3 = s1.toUpperCase();           //���д��ĸ:HELLO
	  String s4 = s1.toLowerCase();           //��Сд��ĸ:hello 
	  String s5 = s1.substring(1,4);          //���Ӵ�(��1��3���ַ�):ell
	  char c2 = s1.charAt(4); 	           //ȡ��4���ַ�:o 
	  String[] s6 = s1.split("e"); 	           //�ָ��ַ���: "H","llo" 
	  String s7 = s1.replace("l","L");        //�滻�ַ���(����):heLLo��
	  String s8 = s1.replaceAll("l","L");     //�滻�ַ���(����):heLLo
	  String s9 = s1.replaceFirst("l","L");   //�滻��һ�γ���:heLlo
	  String s8a = s1.replaceAll("[Hl]","L"); //�滻�����ַ�H��l:LeLLo 
	  String s9a = s1.replaceFirst("[Hl]","L");//�滻��һ�γ����ַ�H��l:Lello
	  String s10 = "   We learn Java";
	  boolean b1=s10.endsWith("Java"); 	// ��ʲô�Ӵ���β:true 
	  boolean b2=s10.startsWith("We"); 	// ��ʲô�Ӵ���ʼ:false 
	  String s11=s10.trim(); 		// ɾ��ͷβ�ո�:We learn Java

	  int i=25;
	  String s12=String.valueOf(i);     // ������ת��Ϊ�ַ���
	  boolean b3=s10.contains("learn"); // �Ƿ�����Ӵ�learn: true 
	  int pos1 = s11.indexOf("e");      // ƥ���Ӵ�������:1.δ�ҵ�����-1.
	  int pos2 = s11.indexOf("e",3);    // ƥ���Ӵ�������:4����λ��3��ʼ 
	  int pos3 = s11.lastIndexOf("e");  // ��β����ǰһ��ƥ���Ӵ�������:4
	  s12=String.format("%05d,%s",501,"op");//��ʽ���ַ�����00501,loop
	  String regex ="(;|,)";                //������ʽ :;��,
	  String[] s14= "a;b,c;d".split(regex); //��;��,�����:"a","b","c","d" 
	  boolean b4=s11.matches("^We.*") ;     //ƥ��������ʽ(��We��ͷ):true. 
	  int n1 = "abcd".compareTo("abcD");     //�ʵ���:32  0����<0С��>0���� 
	  int n2 = "abcd".compareToIgnoreCase("abcD"); //���Դ�Сд
	  byte[] bytes = s11.getBytes();        // ���ַ���ת��Ϊ�ֽ�����
	
  	  String s15="";
	  try{
		//���κα�����ַ���ת����UTF-8����
		s15 = new String(s11.getBytes("ISO-8859-1"),"UTF-8"); 
	  }
	  catch(java.io.UnsupportedEncodingException e){
			e.printStackTrace();  // ��ʾ������Ϣ
	  }
  }
}
