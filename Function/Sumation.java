
import java.util.Scanner;

public class Sumation{
   public static int Sum(int a, int b) {
       int sum = a+b;
       return sum;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the first number: ");
       int c = sc.nextInt();
       System.err.print("Enter the Second number: ");
       int d = sc.nextInt();
       int sum = Sum(c,d);
       System.err.println("Sumation of number "+c + " and " +d + " is: "+sum);


   }
}