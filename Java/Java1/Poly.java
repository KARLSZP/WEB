//Poly.java   
class Shape{        // ����(����)
    int color;      // ������
    void draw(){    // ����
        System.out.println("draw! " + this.getClass());
    }  
}
class Circle extends Shape{  // ����(������)
    void draw(){           
        System.out.println("draw! " + this.getClass());
    };
}

class Square extends Shape{
    void draw(){           
        System.out.println("draw! " + this.getClass());
    };
}

//ͬ����Shape��Ķ���shape1~3��draw()������ͬЧ��
public class Poly{
 public static void main(String args[]){
	Shape shape1 = new Shape();
	shape1.draw();
    Shape shape2 = new Square();
    shape2.draw();
    Shape shape3 = new Circle(); 
    shape3.draw();
 }
}
//���н����draw! class Shape
//          draw! class Square
//          draw! class Circle



