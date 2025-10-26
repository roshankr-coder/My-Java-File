
import java.util.Scanner;

public class patt{
   public static void main(String[] args) {
      Scanner d=new Scanner(System.in);
      System.err.println("enter the n number ");
       int n=d.nextInt();
       for(int i=0; i<n; i++){
         if(i==0 || i==n-1){
             for(int j=0; j<n-1; j++){
                System.err.print("3");
             }
         }
         else{
            for(int j=0; j<n-1; j++){
              if(j==0 || j==2){
                 System.err.print("3");
              }
              else{
                System.err.print(i);
              }
            }
         }
         System.err.println("");
       }
   }
}
