public class SecurityDoor implements Door {   //增加子类
	public void open(){ System.out.println("open security door!");}
	public void close(){ System.out.println("close security door!");}
	public void alarm(){ System.out.println("alarm!");}
}
