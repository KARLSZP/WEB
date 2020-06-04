class DoorEx { 
  public interface Door {
    void open();
  }
}
class DoorTest14 {
   public static void main(String[] args){
        new DoorEx.Door() {
            public void open(){
               System.out.println("open door£¡");
            }
        }.open();
 
    }
}
