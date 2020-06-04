class A {
   final int COUNT=20; // 常量
   final double x;        // 变量(只能赋值一次)
   A(){
      x = Math.random();
   }
   void hi(){
      x = 10.0; // 出错！！！
   }
}
