import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExTest1 {
   public static void main(String args[]){
      Pattern pattern = Pattern.compile("[Jj]ava.+");
      Matcher matcher = pattern.matcher("Javanese");
      boolean mat2 = matcher.matches();            //true
      System.out.println(mat2);                    //true
   }
}