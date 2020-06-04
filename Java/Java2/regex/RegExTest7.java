import java.util.regex.*;
import java.util.Arrays;

public class RegExTest7 {
  public static void main(String[] args) {
        String s1 = "okaa, seeaaa aa youa";
        String regex = "a+";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(s1);
	String s2 = matcher.replaceAll("A");
	System.out.println(s2);      //okA, seeA A youA
        String s3 = s1.replaceAll("a+","A");
	System.out.println(s3);      //okA, seeA A youA
        String arr[]=s1.split("a+");
        Arrays.stream(arr).forEach(s -> System.out.print("["+s+"] "));
    }
}