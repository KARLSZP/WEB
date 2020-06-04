import java.util.*;
class GenericInt implements Show<String,Date>{  
    @Override  
    public void show(String str,Date date) {  
        System.out.println(str);  
        System.out.println(date);  
    }
}
