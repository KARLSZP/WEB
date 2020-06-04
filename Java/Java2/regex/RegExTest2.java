import java.util.regex.Pattern;

public class RegExTest2 {
   public static void main(String args[]){
      boolean mat1 = Pattern.matches("[Jj]ava.+","Javanese");  //true
      System.out.println(mat1);                                //true
   }

}