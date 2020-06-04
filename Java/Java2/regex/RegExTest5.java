import java.util.regex.*;

public class RegExTest5 {
   public static void main(String args[]){
         String regEx = "student(\\d+)(th)ab";  
         String s = "Iamastudent101thabc";  
         Pattern pat = Pattern.compile(regEx);  
         Matcher mat = pat.matcher(s);  
         if(mat.find()){
            System.out.println(mat.group());   //student101th
            System.out.println(mat.group(0));  //student101th
            System.out.println(mat.group(1));  //101
            System.out.println(mat.group(2));  //th
            // System.out.println(mat.group(3));  // 出错
         }
   }

}