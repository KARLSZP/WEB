class A {
    static String s = "Hello!";
    static void f(){
        System.out.println(s);
    }
}
class Test1 {
     public static void main(String[] args){
          System.out.println(A.s);     // 访问静态属性  Hello！
          A.f();                       // 访问静态方法  Hello！
     }
}
