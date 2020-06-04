class E {
   String x;
   E(){
     x = "'Hi'";
   }
   E(String y){
     x = "'" + y + "'";
   }
}
class F extends E{
   String x;
   F(String z){ // 自动调用父类无参数构造器       
      this.x = z + "--" + super.x;      
   }
}

class G {
   public static void main(String args[]){
      F f = new F("Hello!");
      System.out.println(f.x);
   }
}

