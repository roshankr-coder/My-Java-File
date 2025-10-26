import java.util.*;
public class Factorial{
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the number: ");

       int num = sc.nextInt();
       int mult = 1;
       for(int i=num; i>0; i--){
          mult *=i;
         
       }
       System.err.print("Factorial of the number is: "+mult);
   }
}