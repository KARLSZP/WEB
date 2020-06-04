import java.util.regex.*;

public class RegExTest6 {
     static String regex = "foo";
     static String s1 = "fooooooooooooooooo";
     static String s2 = "ooooofoooooooooooo";
     static Pattern pat;
     static Matcher mat1;
     static Matcher mat2;
     public static void main( String args[] ){
       pat  = Pattern.compile(regex);
       mat1 = pat.matcher(s1);
       mat2 = pat.matcher(s2);
       System.out.println("lookingAt(): "+mat1.lookingAt());
       System.out.println("matches(): "+mat1.matches());
       System.out.println("lookingAt(): "+mat2.lookingAt());   
    }
}