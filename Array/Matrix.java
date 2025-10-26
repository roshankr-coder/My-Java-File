import java.util.*;
public class Matrix{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the number of rows: ");
       int rows = sc.nextInt();
       System.err.print("Enter the number of Columns: : ");
       int cols = sc.nextInt();

       //input
       System.err.print("Enter Elements of the Matrix: ");
       int[][] numbers = new int[rows][cols];

       for(int i=0; i<rows; i++){
         for(int j=0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
         }
       }
       System.err.print("Enter the search Element:");
       int x=sc.nextInt();
       for(int i=0; i<rows; i++){
          for(int j=0; j<cols; j++){
             if(numbers[i][j] == x){
                System.err.print(x +" is found at location "+(i+1)+" and "+(j+1));
                break;
             }
          }
       }
   }
}