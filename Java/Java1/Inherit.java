//Inherit.java  getClass()�õ���ǰ����this��������
class Vehicle{               //����(����)��
   int type;                 //������
   void drive(){                //����
     System.out.println("run!" + this.getClass());
   };
}
class Bus extends Vehicle{  //����
}
class Car extends Vehicle{  //����
   void drive(boolean auto){//���ط���
     System.out.println((auto?"run(auto)!":"run(no-auto)!")+this.getClass()); 
   };

}
public class Inherit{
  public static void main(String args[]){ //�������ķ���
	Bus bus = new Bus(); // �ֲ�����(����)��ʼ��
	bus.drive();         // ��������
	Car car = new Car(); 
	car.drive(true);            
  }
}

