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
        helloImpl.sayHi();         // 抽象方法调用
        helloImpl.sayByebye();     // 实例对象调用        
        IHello.sayHello();         // 静态方法调用
        new IHello() {             // 匿名实现类
            @Override
            public void sayHi() {
                System.out.println("say hi(2)!");
            }
        }.sayHi();
    }
}
