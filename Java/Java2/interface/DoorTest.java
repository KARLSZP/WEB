public class DoorTest {
   public static void main(String args[]){
      Door door1 = new OrdinaryDoor();    //����ת��
      Door door2 = new OrdinaryDoor();
      enter(door1);  
      enter(door2);
   }
   public static void enter(Door door){   // ���ýӿ���Ϊ����
     door.open();
     door.close();
   }
}