
import java.util.Scanner;

public class Pattern9{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("Enter the number: ");
      int num = sc.nextInt();
      for(int i=1; i<=num; i++){
        for(int j=1; j<=num-i; j++){
          System.err.print(" ");
        }
        for(int j =1; j<=2*i-1; j++){
          System.err.print("*");
        }
        System.err.println("");
      }
      for(int i=num; i>=1; i--){
        for(int j=1; j<=num-i; j++){
          System.err.print(" ");
        }
        for(int j =1; j<=2*i-1; j++){
          System.err.print("*");
        }
        System.err.println("");
      }
  }
}