public class MathFunc {
	public static void main(String args[]){
		final double num=12.00;

		prn("E="+Math.E); 		// ���� 2.71828
		prn("PI="+Math.PI);      // ����3.14159
		prn("abs(12.0)="+Math.abs(num));   //����ֵ

		prn("ceil(12.45)="+Math.ceil(12.45));   // ����12.45����С����:13
		prn("floor(12.45)="+Math.floor(12.45)); // С��12.45���������:12
		prn("round(12.45)="+Math.round(12.45)); // �������룺12		

		prn("max(12.0,10)="+Math.max(num,10));  // ȡ�����������ֵ
		prn("min(12.0,10)="+Math.min(num,10));  // ȡ����������Сֵ

		prn("random()*1000="+Math.random()*1000); // �����		
		
		prn("cbrt(12.0)="+Math.cbrt(num));   	//������
		prn("sqrt(12.0)="+Math.sqrt(num));   	// ��ƽ����

		prn("exp(12.0)="+Math.exp(num));      	// e��num����
		prn("log(12.0)="+Math.log(num));      	// ��Ȼ����
		prn("log10(12.0)="+Math.log10(num));  	// ��10Ϊ�׵Ķ���
		prn("pow(12.0,3)="+Math.pow(num,3));  	// num��3����		
		
		prn("toRadians(180)="+Math.toRadians(180)); //�ѽǶ�ת��Ϊ����
		prn("toDegrees(Math.PI/3)="+Math.toDegrees(Math.PI/3));

		prn("sin(12.0)="+Math.sin(num));   		// ����
		prn("cos(12.0)="+Math.cos(num));   		// ����
		prn("tan(12.0)="+Math.tan(num));   		// ����

		prn("sinh(12.0)="+Math.sinh(num)); 		// ˫������
		prn("cosh(12.0)="+Math.cosh(num)); 		// ˫������
		prn("tanh(12.0)="+Math.tanh(num)); 		// ˫������

		prn("asin(1.0)="+Math.asin(1)); 		// ������
		prn("acos(1.0)="+Math.acos(1)); 		// ������
		prn("atan(12.0)="+Math.atan(num)); 		// ������
	}
	
	static void prn(String msg){
		System.out.println(msg);
	}
}

