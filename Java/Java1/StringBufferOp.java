public class StringBufferOp {
	public static void main(String args[]){
		StringBuffer s1=new StringBuffer("uv"); // s1="uv"
		s1.append("xyz"); 			// ��xyz����s1��β��:uvxyz 
		s1.insert(2,"w"); 			// ���뵽��2��λ�á�uvwxyz 
		System.out.println(s1.toString());  	// ��ʾs1������
		
		s1.append("vwabc");         		// uvwxyzvwabc
		System.out.println("new s1="+s1.toString());
		int pos1=s1.indexOf("vw", 3); 		// ��λ��3��ʼ�����Ӵ�vw:6
		System.out.println("pos1="+pos1);
		s1.replace(pos1, pos1+2, "wx");	        // ��pos��pos+2�滻�Ӵ�Ϊwx:uvwxyzwxabc
		System.out.println("replace:"+s1);
		String s3= s1.substring(2, 4);    	// ���Ӵ�:wx
		System.out.println("substring:"+s3);
		s1.reverse();			        // �ַ�����ת:cbaxwzyxwvu 
		System.out.println("reverse:"+s1);
		s1.delete(2,4); 		        // ɾ��һ���Ӵ�(�ӵ�2���ַ�����3���ַ�):cbwzyxwvu
		System.out.println(s1.toString());  
		System.out.println("s1.length():"+s1.length());	// �ַ������ȣ�9

	}

}