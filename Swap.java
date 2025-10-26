
import java.util.Scanner;

public  class Swap{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the first digits: ");
       int a = sc.nextInt();
       System.out.print("Enter the Second digits: ");
       int b=sc.nextInt();
       System.out.print("Before the Swapping: "+a+""+b);
       int temp =a;
       a=b;
       b=temp;
       System.out.print("\nAfter the Swapping: "+a+b);
    
   }
}