import java.util.*;
public class Input_String{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Scanner sc1 = new Scanner(System.in);
      System.err.print("Enter your name: ");
      String name = sc.next();
      System.err.print("Enter your Friend name: ");
      String friend_name = sc1.nextLine();
      System.err.println("Your name is: "+name);
      System.err.println("Your Friend name is: "+friend_name);
  }
}