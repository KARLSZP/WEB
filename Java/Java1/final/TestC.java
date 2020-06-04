public class TestC {
   public static void main(String args[]){
       int x = 6;
       C c = new C();
       D d = new D();
       d.hi(x,c);
       System.out.println(x+" "+c.y1+" "+c.y2);
   }
}