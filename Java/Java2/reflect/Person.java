class Person{
   private String name;
   private int age;
   Person() {
        this.name="Li";
        this.age=30;
   }
   Person(String name,int age) {
        this.name=name;
        this.age=age;
   }
   void setAge(int age){
      this.age=age;
   }
   @Override
   public String toString(){
       return "["+this.name+"  "+this.age+"]";
   }
}