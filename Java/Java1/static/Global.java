public class Global {
     public static int x = 20;
     public static void f(){  }
}

class B {
  void fB(){ 
       int y = Global.x;
       Global.f();
  }
}

class C {
  int z;
  void fC(){ 
       Global.x = z + 2;
       Global.f();
  }
}

