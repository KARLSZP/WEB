import java.util.*; 
public class HashMapTest {
  public static void main(String[] args) {
    Map<Integer, Student> stus = new HashMap<Integer, Student>();
    Student stu1 = new Student(103, "He");
    Student stu2 = new Student(112, "李四");
    Student stu3 = new Student(101, "Wang");
    stus.put(103, stu1);	  // 加入新的键值对
    stus.put(112, stu2);
    stus.put(101, stu3);
    Iterator<Integer> it = stus.keySet().iterator(); 
    while (it.hasNext()) { // 无序遍历
      Integer key = (Integer) it.next();
      Student value = stus.get(key); // 根据键值取出值
      System.out.println("***" + value.toString());
    }
    System.out.println("+++" + stus.get(112));     
  }
}
