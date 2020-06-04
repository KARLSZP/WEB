public class DoorTest6 {
    String door1 = "door1";
    static String door2 = "door6";
    static class Door {                          // 静态内部类
       void open(){
          //System.out.println(door1);           // 访问非静态成员，出错!!
          System.out.println(door2 + " open!");  // 可以访问静态成员
       }
    }

   public static void main(String args[]){
      Door door = new Door();
      door.open();
   }
}
