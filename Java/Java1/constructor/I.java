class H {
   String x;
   private H(){
     x = "'Hi'";
   }
   static H make(){
      return new H();
   }
}

class I {
   public static void main(String args[]){
      //H h = new H();   // ����!!
      H h = H.make();
      System.out.println(h.x);
   }
}

