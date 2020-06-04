// ArrayOp.java
import java.util.Arrays;   //导入数组类
public class ArrayOp {
  public static void main(String args[]){
	char s1[]={'H','e','l','l','o'};		 
	s1=Arrays.copyOf(s1,8);     // 复制出一个8元素数组:Hello*** *为null字符 
	System.out.println(s1);
	char s2[];
	s2=Arrays.copyOf(s1,5);     // 复制出一个5元素数组:Hello
	System.out.println(s2);     // 
	char s3[]=Arrays.copyOfRange(s1, 1, 4); // 复制第1~3个元素:ell
	System.out.println(s3);
	Arrays.fill(s3,'a'); 		// 把s3的全部元素填充为a
	System.out.println(s2);     // 结果: aaa
	Arrays.fill(s2,2,4,'a');    // 把s2的第2~3个元素填充为o
	System.out.println(s1);
	boolean r = Arrays.equals(s1,s2); // 比较数组的元素个数和值是否都相等:false
	System.out.println(r);
	int pos=Arrays.binarySearch(s1,'l'); // 查找值为l的元素
	System.out.println(pos);
	Arrays.sort(s1);            // 排序s1:***Hello   *为null
	System.out.println(s1);

	int a[]={3,5,4,26,19,2,9};
	Arrays.sort(a,1,5);         // 排序第1~4个元素:3,4,5,19,26,2,9
	for(int x:a){
		System.out.println(x);
	}
  }
