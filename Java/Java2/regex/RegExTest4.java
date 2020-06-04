import java.util.regex.*;

public class RegExTest4 {
   public static void main(String args[]){
         String regEx = "[Ss]tu";  
         String s = "IastUmastuaaaStuosTuoostuvvv";  
         Pattern p = Pattern.compile(regEx);  
         Matcher m = p.matcher(s);  

         while(m.find()) {
            System.out.println("start: "+m.start());
            System.out.println("end: "+m.end());
            System.out.println("group: "+m.group());
        }
        System.out.println(m.find());
        System.out.println(m.find(0));
        System.out.println("start: "+m.start());
   }

}