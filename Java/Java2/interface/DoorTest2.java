public class DoorTest2 {   
   public static void main(String args[]){
      Door door1 = new OrdinaryDoor();        //向上转型
      Door door2 = new OrdinaryDoor();
      Door door3 = new SecurityDoor();        //增加一个子类
      enter(door1);  
      enter(door2);
      enter(door3);                           //增加的调用
      //door3.alarm();                        //出错！！
   }
   public static void enter(Door door){       //不变
     door.open();
     door.close();
   }
}
