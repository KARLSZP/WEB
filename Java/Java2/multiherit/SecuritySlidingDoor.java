class SecuritySlidingDoor extends SlidingDoor implements Door,Alarm {
   public void open(){ 
      slidingOpen();
   }   
   public void close(){
      slidingClose();
   }   
   public void alarm(){ System.out.println("alarm!");  }
}
