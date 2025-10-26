import java.util.Scanner;
public class Fibonacci{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of teams: ");
       int num = sc.nextInt();
       int a=0,b=1;
       System.err.print(a+" "+b+" ");
       for(int i=2; i<num; i++){
           int c=a+b;
           a=b;
           b=c;
           System.err.print(c+" ");
       }
   }
}