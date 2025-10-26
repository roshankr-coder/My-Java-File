import java.util.*;
public class TwoD_Array{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the Row: ");
       int rows = sc.nextInt();
       System.err.print("Enter the column: ");
       int cols = sc.nextInt();

       int[][] numbers = new int[rows][cols];
       
       //input
       System.out.print("Enter the Elements: ");
       for(int i=0; i<rows; i++){
         for(int j=0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
         }
       }

       //Output
       System.err.println("Matrix is: ");
       for(int i=0; i<rows; i++){
         for(int j=0; j<cols; j++){
           System.err.print(numbers[i][j]+" ");
         }
         System.err.println("");
       }
   }
}