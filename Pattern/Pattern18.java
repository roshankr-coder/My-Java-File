
import java.util.Scanner;

public class Pattern18{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("Enter the number:");
      int num = sc.nextInt();
      for(int i=0; i<num; i++){
          for(int j=0;j<i;j++){
            System.err.print(" ");
          }
          for(int j=0; j<num-i; j++){
            System.err.print(j+i+1+" ");
          }
          System.err.println("");
      }
      for(int i=1;i<num;i++){ 
        for(int j=1;j<=num-i-1;j++){
          System.err.print(" ");
        }
        for(int j=num-i;j<=num;j++){
          System.err.print(j+" ");
        }
        System.err.println("");
      }
  }
}