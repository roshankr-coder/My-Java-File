
import java.util.Scanner;

public class Pattern17{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("Enter the number: ");
      int num = sc.nextInt();
      for(int i=0; i<num; i++){
          for(int j=0;j<i;j++){
            System.err.print(" ");
          }
          for(int j=1; j<=num-i; j++){
            System.err.print(j+i+" ");
          }
          System.err.println("");
      }
  }
}