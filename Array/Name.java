
import java.util.Scanner;

public class Name{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      //Array Syntex
      String name[] = new String[size];
   //Input
      for(int i=0; i<size; i++){
        name[i]=sc.next();
      }
   //Output
      for(int i=0; i<name.length; i++){
        System.err.println("name "+(i+1) + " is "+ name[i]);
      }
  }
}