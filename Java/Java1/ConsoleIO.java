//ConsoleIO.java
import java.util.*;

public class ConsoleIO {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?(line)");
		String name = in.nextLine();   // ����һ��
		System.out.println("How old are you?(int)");
		int age = in.nextInt();        // ����һ������
		System.out.println("How much do you weigh?(float)");
		float weight = in.nextFloat(); // ����һ��������
		System.out.println("name:"+name+" age:"+age+" weight:"+weight);

		System.out.println("Input three words:\r\n");
		int cnt = 0;
		while (in.hasNext() && cnt < 3) { // �Ƿ��е���
			String word = in.next();      // ��ȡ��һ������
			System.out.println("" + cnt + ": " + word);
			cnt++;
		}

		in = new Scanner("11.0 22.0 33.0 44.0 55.0"); // ֱ�������ַ���
		while (in.hasNextDouble()) {    // �Ƿ���˫������
			double x = in.nextDouble(); // ������һ��˫������
			System.out.println(x);
		}
	}
	

}



