class I {
   void fI(){ // ��̬����
   }
}
class J extends I {
   J(){}
   int x;
   static void fJ(){
      this.x = 2;   // ����!!
      super.fI();   // ����!!      
   }
}
