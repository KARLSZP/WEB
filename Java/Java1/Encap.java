class Rectangle {  	    // ����
  double height;             // ������(��Ա����)
  double width;              // ������(��Ա����)
  double getArea(){          // ����(��Ա����)
    double area=height*width;// �ֲ�����
    return area;             // ����ֵ
  };
  double getArea(int times){ // ���ط���
    return height*width*times;
  };
}
public class Encap {  		        // ����
 public static void main(String args[]){ // ����
   Rectangle rect = new Rectangle();     // ��һ���¶���
   rect.height=10;                	// ������ֵ
   rect.width=20;             	        // ������ֵ
   System.out.println(rect.getArea());   // ���÷���
 }
}
