import java.lang.reflect.*;

class ReflectTest1{
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("Person");
        
        System.out.println(cls.getName());
        Person per1 = (Person) cls.newInstance();
        per1.setAge(16);
        System.out.println(per1);

        Constructor PerConst = cls.getDeclaredConstructor(
                                  new Class[]{String.class,int.class}); // ��ȡ������
        Person per2=(Person)PerConst.newInstance(new Object[]{"Chen",6});
        System.out.println(per2);
    }
}
