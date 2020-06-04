class D2 {
   String t = "Hello!";   // 非静态数据域
   E s = new E();         // 非静态数据域
   void fD(){             // 非静态方法
      System.out.println(t);  
   }
   public static void main(String args[]){  // 静态方法
      D2 d = new D2();
      d.s.x  = "Hi!";            // 直接用s.x会出错
      d.fD();                    // 用fD()代替d.fD()会出错
      System.out.println(d.s.x);
      System.out.println(d.t);   // 用t代替d.t会出错
   }
}

class E {
   String x="ABC!";
}

