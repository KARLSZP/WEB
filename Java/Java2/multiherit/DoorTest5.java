public class DoorTest5 {
   public static void main(String args[]){
      SecurityDoorX door1 = new SecurityDoorX();
      SecuritySlidingDoor door2 = new SecuritySlidingDoor();
      enter(door1);    
      alarm(door1);
      enter(door2);      
      alarm(door2);
   }
   public static void enter(Door door){
      door.open();
      door.close();
   }
   public static void alarm(Alarm alarm){ 
     alarm.alarm();
   }
}
