class InitStep {
  int x = 10;           
  double y = Math.random();  // 调用方法进行初始化
  int z;
  {      
     z = 20;          // 每次创建实例时执行一次
  }
  static int s;
  static {      
     s = 20;     // 只在装载类时执行一次  
  }
}

class RandNum {
   int x;
   double y;
   RandNum(int x){
	  this.x = x;         // this.x指本对象的成员变量x
	  y = Math.random();  // 也可以用this.y
   }   
}

