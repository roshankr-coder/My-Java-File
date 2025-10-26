import java.util.Scanner;
public class Binary_To_Decimal{
   public static void main(String[] args) {
    int r, d=0,base=1;
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the Binary number: ");
       int num = sc.nextInt();
       while(num>0){
          r=num%10;
          d=d+r*base;
          num/=10;
          base*=2;
          
       }
       System.err.println("Decimal number is: "+d);
   }
}