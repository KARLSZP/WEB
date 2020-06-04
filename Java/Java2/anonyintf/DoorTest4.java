public class DoorTest4 {
   static void enter(Door door){
          door.open();            //�ص�����
          door.close();           //�ص�����
   }
   public static void main(String[] args){
      enter(new Door(){
               @Override
 	       public void open(){
                    System.out.println("open anonymous door!");
               }	
               @Override
   	       public void close(){
                   System.out.println("close anonymous door!");
               };
            }
       );
   }
}