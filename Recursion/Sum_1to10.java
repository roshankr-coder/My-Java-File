import java.util.*;
public class Sum_1to10{
   public static int Sum(int num){
      if(num>0){
         return num + Sum(num-1);
      }
      return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number: ");
        int n = sc.nextInt();
        int result = Sum(n);
        System.err.println(result);
    }
}