//Poly.java   
class Shape{        // 父类(基类)
    int color;      // 数据域
    void draw(){    // 方法
        System.out.println("draw! " + this.getClass());
    }  
}
class Circle extends Shape{  // 子类(导出类)
    void draw(){           
        System.out.println("draw! " + this.getClass());
    };
}

class Square extends Shape{
    void draw(){           
        System.out.println("draw! " + this.getClass());
    };
}

//同属于Shape类的对象shape1~3的draw()产生不同效果
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
//运行结果：draw! class Shape
//          draw! class Square
//          draw! class Circle



