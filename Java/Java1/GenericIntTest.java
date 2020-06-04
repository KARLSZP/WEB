import java.util.*;

// 泛型接口
interface Show<T,U>{  
    void show(T t,U u);  
}  
  
class GenericIntTest implements Show<String,Date>{  
    @Override  
    public void show(String str,Date date) {  
        System.out.println(str);  
        System.out.println(date);  
    }

    // 泛型方法
    public static <T, U> T get(T t, U u) {  
        if (u!=null)  
            return t;  
        else  
            return null;  
    }

    // 限定继承或实现Comparable类（extends也用于接口）;可以用&并列两个接口
    //        例如： <T extends Comparable&Serialize>
    public static <T extends Comparable> T get2(T t1,T t2) { //添加类型限定  
        if(t1.compareTo(t2)>=0);  
        return t1;  
    }  

    public static void main(String[] args) throws ClassNotFoundException {  
        GenericIntTest showTest=new GenericIntTest();  
        showTest.show("Hello",new Date()); 

        String str=get("Hello", "World");
        System.out.println(str); 

        int i=get(100,200);
        System.out.println(i); 
    }   
}