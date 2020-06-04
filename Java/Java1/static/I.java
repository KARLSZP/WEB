class I {
   void fI(){ // 静态方法
   }
}
class J extends I {
   J(){}
   int x;
   static void fJ(){
      this.x = 2;   // 出错!!
      super.fI();   // 出错!!      
   }
}
