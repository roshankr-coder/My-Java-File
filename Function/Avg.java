
import java.util.Scanner;

public class Avg{
   public static int average(int a, int b, int c){
     int sum = a+b+c;
     return sum/3;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the first number: ");
       int a = sc.nextInt();
       System.err.print("Enter the second number: ");
       int b = sc.nextInt();
       System.err.print("Enter the third number: ");
       int c = sc.nextInt();
       int avg = average(a,b,c);
       System.err.print("Average of three number is: "+avg);
   }
}