class F {
   final int x = 10;
   int y;
   final void hi(){
      y = x * 2;
   }
}

class G extends F{
   int x;      // 新数据域
   void hi(){  // 出错!!      
      x = super.x * 2;
   }
}
