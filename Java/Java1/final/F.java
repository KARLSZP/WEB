class F {
   final int x = 10;
   int y;
   final void hi(){
      y = x * 2;
   }
}

class G extends F{
   int x;      // ��������
   void hi(){  // ����!!      
      x = super.x * 2;
   }
}
