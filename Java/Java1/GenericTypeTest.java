class Food{}
class Fruit extends Food{}
class Meat extends Food{}
class Banana extends Fruit{}
class Pork extends Meat{}
class Beef extends Meat{}
class Apple extends Fruit{}
class GaliApple extends Apple{}
class SnakeApple extends Apple{}

class Plate<SSS>{
  private SSS item;
  public Plate(SSS t){item=t;}
  public void set(SSS t){item=t;}
  public SSS get(){return item;}
}

class GenericTypeTest{
  public static void func1(Plate<? extends Fruit> p){
  }

  public static void main(String[] args){
      Plate<?> p=new Plate<Apple>(new Apple());     

      // Plate<Fruit> q1=new Plate<Apple>(new Apple());  /*error*/

      //  <? super Apple>使用Fruit及其子孙类作为泛型（上界）
      Plate<? extends Fruit> r2=new Plate<Fruit>(new Fruit()); 
      Plate<? extends Fruit> r3=new Plate<Apple>(new Apple());   
      Plate<? extends Fruit> r4=new Plate<GaliApple>(new GaliApple());
      // Plate<? extends Fruit> s1=new Plate<Food>(new Food());  /*error*/
      // Plate<? extends Fruit> s2=new Plate<Pork>(new Pork());  /*error*/

      //  <? super Apple>使用Apple及其祖先类作为泛型（下界）
      Plate<? super Apple> v1=new Plate<Apple>(new Apple());     
      Plate<? super Apple> v2=new Plate<Fruit>(new Fruit());  
      Plate<? super Apple> v3=new Plate<Food>(new Food());
      // Plate<? super Apple> v3=new Plate<GaliApple>(new GaliApple()); /*error*/

      func1(r2);
      //r2.set(new Apple());   /*error*/
     
      Fruit x1=r2.get();
      Apple x2=(Apple)r3.get();

      v1.set(new Apple());

      Object z=v1.get();
      // Apple y=v1.get();  /*error*/
  }
}
