import java.lang.reflect.*;

class ReflectTest3{
    public static void main(String[] args) throws Exception{
       Class c=Class.forName("com.group.Pork");   // 包名.类名
       Method method=c.getMethod("eat");
       method.invoke(c.newInstance());                              // Java9之后显示已过时
       // method.invoke(c.getDeclaredConstructor().newInstance());  // Java9之后使用
    }
}
