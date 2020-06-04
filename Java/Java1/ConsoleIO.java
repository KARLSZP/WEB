//ConsoleIO.java
import java.util.*;

public class ConsoleIO {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?(line)");
		String name = in.nextLine();   // 输入一行
		System.out.println("How old are you?(int)");
		int age = in.nextInt();        // 输入一个整数
		System.out.println("How much do you weigh?(float)");
		float weight = in.nextFloat(); // 输入一个浮点数
		System.out.println("name:"+name+" age:"+age+" weight:"+weight);

		System.out.println("Input three words:\r\n");
		int cnt = 0;
		while (in.hasNext() && cnt < 3) { // 是否还有单词
			String word = in.next();      // 读取下一个单词
			System.out.println("" + cnt + ": " + word);
			cnt++;
		}

		in = new Scanner("11.0 22.0 33.0 44.0 55.0"); // 直接输入字符串
		while (in.hasNextDouble()) {    // 是否还有双精度数
			double x = in.nextDouble(); // 读出下一个双精度数
			System.out.println(x);
		}
	}
	

}



