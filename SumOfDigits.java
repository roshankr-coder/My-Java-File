import java.util.*;
public class SumOfDigits{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the number: ");
       int num = sc.nextInt();
       int sum= 0;
       while(num > 0){
          int digits = num%10;
          sum+=digits;
          num/=10;
       }
       System.err.print("Sum of the number: "+sum);
   }
}