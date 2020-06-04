import java.util.regex.Pattern;

public class RegExTest3 {
   public static void main(String args[]){
      boolean mat1 = Pattern.matches("\\bnice\\b.+","nice day");  // true
      System.out.println(mat1);                           
      boolean mat2 = Pattern.matches("\\snice\\s.+","nice day");  // false
      System.out.println(mat2);
   }

}