class DoorTest10 {
    String door = "door10";
    protected class Door {                      // 成员内部类
       void open(){  
          System.out.println(door + " open!"); 
       }
    }
}
