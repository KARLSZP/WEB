class InitStep {
  int x = 10;           
  double y = Math.random();  // ���÷������г�ʼ��
  int z;
  {      
     z = 20;          // ÿ�δ���ʵ��ʱִ��һ��
  }
  static int s;
  static {      
     s = 20;     // ֻ��װ����ʱִ��һ��  
  }
}

class RandNum {
   int x;
   double y;
   RandNum(int x){
	  this.x = x;         // this.xָ������ĳ�Ա����x
	  y = Math.random();  // Ҳ������this.y
   }   
}

