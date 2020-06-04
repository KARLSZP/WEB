public class StringBufferOp {
	public static void main(String args[]){
		StringBuffer s1=new StringBuffer("uv"); // s1="uv"
		s1.append("xyz"); 			// 把xyz并入s1的尾部:uvxyz 
		s1.insert(2,"w"); 			// 插入到第2个位置。uvwxyz 
		System.out.println(s1.toString());  	// 显示s1的内容
		
		s1.append("vwabc");         		// uvwxyzvwabc
		System.out.println("new s1="+s1.toString());
		int pos1=s1.indexOf("vw", 3); 		// 从位置3开始查找子串vw:6
		System.out.println("pos1="+pos1);
		s1.replace(pos1, pos1+2, "wx");	        // 从pos到pos+2替换子串为wx:uvwxyzwxabc
		System.out.println("replace:"+s1);
		String s3= s1.substring(2, 4);    	// 求子串:wx
		System.out.println("substring:"+s3);
		s1.reverse();			        // 字符串反转:cbaxwzyxwvu 
		System.out.println("reverse:"+s1);
		s1.delete(2,4); 		        // 删除一个子串(从第2个字符到第3个字符):cbwzyxwvu
		System.out.println(s1.toString());  
		System.out.println("s1.length():"+s1.length());	// 字符串长度：9

	}

}