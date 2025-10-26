abstract class Animal{
   abstract void walk();
   Animal(){     //Constructor
      System.out.println("You are creating a new Animal");
   }
   public void eat(){ 
     System.err.println("Animal Eats");
   }

}

class Horse extends Animal{

    Horse() {
       System.err.println("Created a Horse");
    }
   
   public void walk(){
     System.err.println("Walk on 4 legs.");
   }
}

class Chicken extends Animal{
   public void walk(){
     System.err.println("Walk on 2 legs.");
   }
}

public class Constructor{
   public static void main(String[] args) {
       Horse horse = new Horse();
       horse.walk();
   }
}