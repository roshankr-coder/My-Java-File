
//interfaces always public
interface Animal{
  int eyes = 2;   //fixed for all Animal
  void walk();
}

class Horse implements Animal{
   public void walk(){
      System.err.println("walk on 4 legs");
    }
}

public class Interface{
   public static void main(String[] args) {
       Horse horse = new Horse();
       horse.walk();
   }
}