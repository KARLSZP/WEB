class DoorTest12 {
    String door = "door12";
    void openDoor(){
       class Door {                                // 方法内部类
          void open(){  
             System.out.println(door + " open!");
          }
       }
       Door door = new Door();
       door.open();
    }
    public static void main(String args[]){
      DoorTest12 doorTest = new DoorTest12();
      doorTest.openDoor();
    }
}
