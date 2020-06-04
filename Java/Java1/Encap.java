class Rectangle {  	    // 类名
  double height;             // 数据域(成员变量)
  double width;              // 数据域(成员变量)
  double getArea(){          // 方法(成员函数)
    double area=height*width;// 局部变量
    return area;             // 返回值
  };
  double getArea(int times){ // 重载方法
    return height*width*times;
  };
}
public class Encap {  		        // 类名
 public static void main(String args[]){ // 方法
   Rectangle rect = new Rectangle();     // 建一个新对象
   rect.height=10;                	// 数据域赋值
   rect.width=20;             	        // 数据域赋值
   System.out.println(rect.getArea());   // 调用方法
 }
}
