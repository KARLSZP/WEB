import java.util.*;
public class ArrayListTest {
   public static void main(String[] args) {
     ArrayList<Student> stus = new ArrayList<Student>(); // ����(�μ���¼)
     Student stu1 = new Student(101, "Wang");
     Student stu2 = new Student(102, "Li");
     Student stu3 = new Student(103, "He");
     Student stu4 = new Student(112, "����");
     stus.add(stu1); 		// β��׷��
     stus.add(stu2);
     stus.add(stu3); 
     stus.add(1, stu4); 	// �м����
     Iterator<Student> it = stus.iterator();
     while (it.hasNext()) {       // ˳��ȡ��
	 System.out.println("***" + it.next()); 
     }
     System.out.println("+++" + stus.get(2)); // ���ȡ��
     stus.forEach(stu->{stu.name=stu.name+"*"; 
                 System.out.println(stu);});
     List<Student> stus2=Arrays.asList(stu1,stu2,stu3);// ������ת������add
     System.out.println("###" + stus2);
   }
}

class Student {
    int num; 		 // ѧ��
    String name; 	 // ����
    Student(int num, String name) { this.num = num; this.name = name; }
    public String toString() { return num + " " + name; }
}
