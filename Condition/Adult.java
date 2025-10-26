
import java.util.Scanner;

public class Adult{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int age = sc.nextInt();
      if(age>=18){
        System.out.print("You are Adult.");
      }
      else{
        System.err.print("You are Not Adult.");
      }
   }
}