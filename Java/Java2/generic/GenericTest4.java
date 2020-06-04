class Meat{}
class Pork extends Meat{}
class Beef extends Meat{}

class Dish<T>{       // TÎª·ºÐÍ
     T food;
     public Dish(T t){food = t;}
}

public class GenericTest4 {
   public static void eat(Dish<? extends Meat> dish){
       System.out.println("eat "+dish.food.getClass());
   }

   public static void main(String args[]){
       Dish<? extends Meat> dish1 = new Dish<Pork>(new Pork());
       Dish<? super Pork> dish2 = new Dish<Meat>(new Meat()); 
       eat(dish1);
       //eat(dish2);   // ³ö´í! 
   }

}