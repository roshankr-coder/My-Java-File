import java.util.Scanner;
public class TableFor{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num = sc.nextInt();
      for(int i =1; i<11; i++){
           int mul = i*num;
           System.out.println(mul);
      }
   }
}