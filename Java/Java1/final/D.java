class D {
   static E s = new E();
   final static String t = "Hello!";
   public static void main(String args[]){
      s.x  = "Hi";
      System.out.println(s.x);
      t = "Hi";  // ����!!
   }
}
class E {
   String x;
}