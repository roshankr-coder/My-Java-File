abstract class Animal{
   abstract void walk();
   public void eat(){
     System.err.println("Animal Eats");
   }

}

class Horse extends Animal{
   public void walk(){
     System.err.println("Walk on 4 legs.");
   }
}

class Chicken extends Animal{
   public void walk(){
     System.err.println("Walk on 2 legs.");
   }
}

public class Abst{
   public static void main(String[] args) {
       Horse horse = new Horse();
       horse.walk();
       horse.eat();
   }
}