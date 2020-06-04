public class MathFunc {
	public static void main(String args[]){
		final double num=12.00;

		prn("E="+Math.E); 		// 常量 2.71828
		prn("PI="+Math.PI);      // 常量3.14159
		prn("abs(12.0)="+Math.abs(num));   //绝对值

		prn("ceil(12.45)="+Math.ceil(12.45));   // 大于12.45的最小整数:13
		prn("floor(12.45)="+Math.floor(12.45)); // 小于12.45的最大整数:12
		prn("round(12.45)="+Math.round(12.45)); // 四舍五入：12		

		prn("max(12.0,10)="+Math.max(num,10));  // 取两个数的最大值
		prn("min(12.0,10)="+Math.min(num,10));  // 取两个数的最小值

		prn("random()*1000="+Math.random()*1000); // 随机数		
		
		prn("cbrt(12.0)="+Math.cbrt(num));   	//立方根
		prn("sqrt(12.0)="+Math.sqrt(num));   	// 正平方根

		prn("exp(12.0)="+Math.exp(num));      	// e的num次幂
		prn("log(12.0)="+Math.log(num));      	// 自然对数
		prn("log10(12.0)="+Math.log10(num));  	// 以10为底的对数
		prn("pow(12.0,3)="+Math.pow(num,3));  	// num的3次幂		
		
		prn("toRadians(180)="+Math.toRadians(180)); //把角度转换为弧度
		prn("toDegrees(Math.PI/3)="+Math.toDegrees(Math.PI/3));

		prn("sin(12.0)="+Math.sin(num));   		// 正弦
		prn("cos(12.0)="+Math.cos(num));   		// 余弦
		prn("tan(12.0)="+Math.tan(num));   		// 正切

		prn("sinh(12.0)="+Math.sinh(num)); 		// 双曲正弦
		prn("cosh(12.0)="+Math.cosh(num)); 		// 双曲余弦
		prn("tanh(12.0)="+Math.tanh(num)); 		// 双曲正切

		prn("asin(1.0)="+Math.asin(1)); 		// 反正弦
		prn("acos(1.0)="+Math.acos(1)); 		// 反余弦
		prn("atan(12.0)="+Math.atan(num)); 		// 反正切
	}
	
	static void prn(String msg){
		System.out.println(msg);
	}
}

