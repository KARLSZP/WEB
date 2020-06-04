class Door {
   void open(){System.out.println("open door!");};
   void close(){System.out.println("close door!");};
}
class Alarm {
   void alarm(){System.out.println("alarm!");};
}
public class DoorTest13 extends Door{
   class SchoolAlarmDoor extends Alarm{
        void enter(){
           open(); alarm(); close();
        }
   }
   public static void main(String[] args){
      DoorTest13 doorTest = new DoorTest13();
      SchoolAlarmDoor door = doorTest.new SchoolAlarmDoor();
      door.enter();
   }
}