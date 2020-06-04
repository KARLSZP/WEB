public class DoorTest {
   public static void main(String args[]){
      Door door1 = new OrdinaryDoor();    //向上转型
      Door door2 = new OrdinaryDoor();
      enter(door1);  
      enter(door2);
   }
   public static void enter(Door door){   // 采用接口作为参数
     door.open();
     door.close();
   }
}