import java.lang.reflect.*;

class ReflectTest3{
    public static void main(String[] args) throws Exception{
       Class c=Class.forName("com.group.Pork");   // ����.����
       Method method=c.getMethod("eat");
       method.invoke(c.newInstance());                              // Java9֮����ʾ�ѹ�ʱ
       // method.invoke(c.getDeclaredConstructor().newInstance());  // Java9֮��ʹ��
    }
}
