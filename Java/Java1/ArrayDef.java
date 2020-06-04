// ArrayDef.java
import java.util.Arrays;

public class ArrayDef {
  public static void main(String args[]){
         int sample34[23];
	 int sample[];                   // 定义数组对象，初始值为null
	 sample = new int[8];     		 // 定义一维整数数组，并分配存储空间大小（8个整数）
	 sample[7]=100;					 // 数组引用方法
	 System.out.println(sample[7]);  // 显示第7个元素：100。（从第0个开始,以下同）  
	 System.out.println(sample[0]);	 // 显示：0（默认值）。
	
	 int rnds[];
	 rnds = new int[]{1,3,4,5,6};
	 System.out.println(Arrays.toString(rnds));//显示全部数组元素：[1,3,4,5,6]  	 
	 char[] chars = {'我', '是', '中', '大','人'};//初始化一维字符数组，并分配存储空间大小（5个字符）
	 System.out.println(chars[3]);			 // 显示第4个的字符：和。
	 
	 String[] s1= {"John", "Wade", "James"}; // 初始化一维字符串数组
	 System.out.println(s1[1]);				 // 显示从第1个字符串：Wade
	 
	 int nums[] = {9, -10, 18, -978, 9, 287, 49, 7}; 
	 for(int num:nums){ 					 // 枚举循环法
		 System.out.println(num); 			 // 显示数组nums的全部元素
	 }
	
	 double map[][] = new double[3][10];	 // 定义二维双精度数组：共3行，每行10列
	 map[0][9] = 20;
	 System.out.println(map[0][9]);
	 
	 int table[][] = {{1},{2,3,4},{5,6,7,8}};  // 初始化二维数组（可变长）
	 for(int i=0; i<table.length; i++){      // table.length为行数
	   for(int j=0; j<table[i].length; j++){ // 第table[i].length行的元素个数(列数)
		  System.out.println(table[i][j]);   // 显示第i行第j列的元素：1,2,3,4,5,6,7,8
	   }
	 }
  }
}