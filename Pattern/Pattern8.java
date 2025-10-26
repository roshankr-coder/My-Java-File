import java.util.*;
public class Pattern8{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the number: ");
       int num = sc.nextInt();
      for(int i=1; i<=num; i++){
        for(int j=1; j<=num-i; j++){
          System.err.print(" ");
        }
        for(int j=i; j>=1; j--){
          System.err.print(j);
        }
        for(int j=2; j<=i; j++){
          System.err.print(j);
        }
        System.err.println("");
      }
   }
}