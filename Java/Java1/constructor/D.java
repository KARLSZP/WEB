class B {
   String x;
   B(String y){
     x = "'" + y + "'";
   }
}
class C extends B{
   String x;
   C(String z){
      super(z);  // ���ø��๹����
      this.x = z + "--" + super.x;      
   }
}

class D {
   public static void main(String args[]){
      //C c1 = new C();        // ����!!
      C c2 = new C("Hello!");
      System.out.println(c2.x);
   }
}

