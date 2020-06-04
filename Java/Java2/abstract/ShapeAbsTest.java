abstract class ShapeAbs {		        // 抽象类
   public ShapeAbs() {    		        // 构造函数(constructor) 
      System.out.println("Shape Initialized!");
   } 
   public abstract void draw();   	// 抽象方法(method) 
}

class Circle extends ShapeAbs {
   public void draw() {                   // 定义方法draw()
      System.out.println("Circle draw() is called!"); 
   }
}
public class ShapeAbsTest {
  public static void main(String args[]){ 
      Circle circle1 = new Circle();
      circle1.draw();
  }
}

