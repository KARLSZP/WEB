interface IHello {
    void sayHi(); 
    static void sayHello(){System.out.println("say hello!");}
    default void sayByebye(){System.out.println("say byebye!");}
}
class HelloImpl implements IHello {
    @Override
    public void sayHi() {System.out.println("say hi!");  }
}
public class IntDefault {
    public static void main(String[] args) {
        HelloImpl helloImpl = new HelloImpl();
        helloImpl.sayHi();         // ���󷽷�����
        helloImpl.sayByebye();     // ʵ���������        
        IHello.sayHello();         // ��̬��������
        new IHello() {             // ����ʵ����
            @Override
            public void sayHi() {
                System.out.println("say hi(2)!");
            }
        }.sayHi();
    }
}
