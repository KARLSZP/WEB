abstract class ShapeAbs {		        // ������
   public ShapeAbs() {    		        // ���캯��(constructor) 
      System.out.println("Shape Initialized!");
   } 
   public abstract void draw();   	// ���󷽷�(method) 
}

class Circle extends ShapeAbs {
   public void draw() {                   // ���巽��draw()
      System.out.println("Circle draw() is called!"); 
   }
}
public class ShapeAbsTest {
  public static void main(String args[]){ 
      Circle circle1 = new Circle();
      circle1.draw();
  }
}

