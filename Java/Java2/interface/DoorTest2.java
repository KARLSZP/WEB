public class DoorTest2 {   
   public static void main(String args[]){
      Door door1 = new OrdinaryDoor();        //����ת��
      Door door2 = new OrdinaryDoor();
      Door door3 = new SecurityDoor();        //����һ������
      enter(door1);  
      enter(door2);
      enter(door3);                           //���ӵĵ���
      //door3.alarm();                        //������
   }
   public static void enter(Door door){       //����
     door.open();
     door.close();
   }
}
