public class DoorTest6 {
    String door1 = "door1";
    static String door2 = "door6";
    static class Door {                          // ��̬�ڲ���
       void open(){
          //System.out.println(door1);           // ���ʷǾ�̬��Ա������!!
          System.out.println(door2 + " open!");  // ���Է��ʾ�̬��Ա
       }
    }

   public static void main(String args[]){
      Door door = new Door();
      door.open();
   }
}
