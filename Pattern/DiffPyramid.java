public class DiffPyramid{
    public static void main(String[] args){
         int n=4;
         for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
              System.err.print(" ");
            }
            for(int k=1; k<=i; k++){
              System.err.print("*");
            }
            System.err.println("");
         }
    }
}