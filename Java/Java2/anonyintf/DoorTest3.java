public class DoorTest3 {
   static void enter(Door door){
         door.open(); door.close();
   }
   public static void main(String[] args){
      Door door= new Door(){
               @Override
 	      public void open(){  //回调函数
                    System.out.println("open anonymous door!");
               }	
               @Override
	      public void close(){  //回调函数
		 System.out.println("close anonymous door!");
               };
      };
      enter(door);
   }
}