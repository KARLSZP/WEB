class DoorTest7 {
    String door1 = "door7";
    class Door {                                 // 成员内部类
       void open(){  
          System.out.println(door1 + " open!");
       }
    }

    public static void main(String args[]){
      DoorTest7 doorTest = new DoorTest7();
      Door door = doorTest.new Door();
      door.open();
    }
}


