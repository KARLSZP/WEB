class A {
    static String s = "Hello!";
    static void f(){
        System.out.println(s);
    }
}
class Test1 {
     public static void main(String[] args){
          System.out.println(A.s);     // ���ʾ�̬����  Hello��
          A.f();                       // ���ʾ�̬����  Hello��
     }
}
