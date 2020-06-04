import java.util.*;
public class ArrayListTest {
   public static void main(String[] args) {
     ArrayList<Student> stus = new ArrayList<Student>(); // 泛型(参见附录)
     Student stu1 = new Student(101, "Wang");
     Student stu2 = new Student(102, "Li");
     Student stu3 = new Student(103, "He");
     Student stu4 = new Student(112, "李四");
     stus.add(stu1); 		// 尾部追加
     stus.add(stu2);
     stus.add(stu3); 
     stus.add(1, stu4); 	// 中间插入
     Iterator<Student> it = stus.iterator();
     while (it.hasNext()) {       // 顺序取出
	 System.out.println("***" + it.next()); 
     }
     System.out.println("+++" + stus.get(2)); // 随机取出
     stus.forEach(stu->{stu.name=stu.name+"*"; 
                 System.out.println(stu);});
     List<Student> stus2=Arrays.asList(stu1,stu2,stu3);// 用数组转，不能add
     System.out.println("###" + stus2);
   }
}

class Student {
    int num; 		 // 学号
    String name; 	 // 姓名
    Student(int num, String name) { this.num = num; this.name = name; }
    public String toString() { return num + " " + name; }
}
