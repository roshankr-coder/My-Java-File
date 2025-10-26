
import java.util.Scanner;

public class SumOdd{
   public static int SumPrint(int n){
    int sum =0;
       for(int i=1; i<=n; i++){
           if(i%2!=0){
              sum += i;
           }
       }
       return sum;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.err.print("Enter the number:");
      int num = sc.nextInt();
       System.err.println(SumPrint(num));
   }
}