public class DoorTest4 {
   static void enter(Door door){
          door.open();            //回调函数
          door.close();           //回调函数
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