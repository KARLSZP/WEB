import java.lang.reflect.*;

class ReflectTest2{
    public static void main(String[] args) throws Exception{
        String sBuffer = "";
        Class<?> cls = Class.forName("Person");

        System.out.println(cls.getName()+"的构造器有：");
        Constructor[] allConstructs = cls.getDeclaredConstructors();
        for (int i = 0; i < allConstructs.length; i++) {
            sBuffer = Modifier.toString(allConstructs[i].getModifiers());
            //sBuffer =  sBuffer + " " + allConstructs[i].getReturnType().getSimpleName();
            sBuffer =  sBuffer + " " + allConstructs[i].getName() + "(";            
            Class<?>[] ptypes = allConstructs[i].getParameterTypes();
            for (int j = 0; j < ptypes.length; j++) {
                 sBuffer =  sBuffer + " "+ ptypes[j].getSimpleName();
            }
            System.out.println(sBuffer + ")");
        }

        System.out.println("\n" + cls.getName()+"的方法有：");
        Method[] allMethods = cls.getDeclaredMethods();
        for (int i = 0; i < allMethods.length; i++) {
            sBuffer = Modifier.toString(allMethods[i].getModifiers());
            sBuffer =  sBuffer + " " + allMethods[i].getReturnType().getSimpleName();
            sBuffer =  allMethods[i].getName() + "(";
            Class<?>[] ptypes = allMethods[i].getParameterTypes();
            for (int j = 0; j < ptypes.length; j++) {
                 sBuffer =  sBuffer + " " + ptypes[j].getSimpleName();
            }
            System.out.println(sBuffer + ")");
        }

        System.out.println("\n" + cls.getName()+"的属性有：");
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            sBuffer = Modifier.toString(fields[i].getModifiers());
            sBuffer = sBuffer + " "+ fields[i].getType().getSimpleName();
            sBuffer = sBuffer + " "+ fields[i].getName();
            System.out.println(sBuffer);
        }
    }
}
