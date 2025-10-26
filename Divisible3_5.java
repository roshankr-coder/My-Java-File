import java.util.*;
public class Divisible3_5{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("Enter the End numbers: ");
      int num = sc.nextInt();
      System.err.print("Divisible By 3: ");
      for(int i=1; i<=num; i++){
         if(i%3==0){
           System.err.print(i+" ");
         }
      }
      System.err.println("");
      System.err.print("Divisible By 5: ");

      for (int i = 1; i <=num; i++) {
          if(i%5==0){
             System.err.print(i+" ");
          }
      }
      System.err.println("");
      System.err.print("Divisible By 3 and 5: ");
      for(int i=1; i<=num; i++){
         if(i%3==0 && i%5==0){
           System.err.print(i+" ");
         }
      }
   }
}