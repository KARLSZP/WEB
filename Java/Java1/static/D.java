class D {
   String s = "Hello!";        // 非静态数据域
   static String t = "Hi!";    // 静态数据域

   void fD1(){                 // 非静态方法
      System.out.println("D,"+s);  
   }

   static void fD2(){          // 静态方法
      System.out.println("D,"+t);  
   }

   public static void main(String args[]){  // 静态方法
      //System.out.println(s); // 出错!!
      System.out.println(t);
      //fD1();                 // 出错!!
      fD2();
   }
}
