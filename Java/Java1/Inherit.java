//Inherit.java  getClass()得到当前对象（this）的类名
class Vehicle{               //父类(基类)名
   int type;                 //数据域
   void drive(){                //方法
     System.out.println("run!" + this.getClass());
   };
}
class Bus extends Vehicle{  //子类
}
class Car extends Vehicle{  //子类
   void drive(boolean auto){//重载方法
     System.out.println((auto?"run(auto)!":"run(no-auto)!")+this.getClass()); 
   };

}
public class Inherit{
  public static void main(String args[]){ //带参数的方法
	Bus bus = new Bus(); // 局部变量(对象)初始化
	bus.drive();         // 方法调用
	Car car = new Car(); 
	car.drive(true);            
  }
}

