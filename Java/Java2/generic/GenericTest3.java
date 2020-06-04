public class GenericTest3 {
   public static void main(String args[]){
       String str= GenericRestrict.getF("Hello", "World"); 
       System.out.println(str);  
       int i = GenericRestrict.getF(200, 100); 
       System.out.println(i);  
   }

}