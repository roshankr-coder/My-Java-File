public class Pattern12{
   public static void main(String[] args) {
      int n=4;
      for(int i=1; i<=n; i++){
          for(int j=0; j<n-i; j++){
            System.err.print(" ");
          }
          for(int j=0; j<i; j++){
            System.err.print("*");
          }
          System.err.println("");
      }
      for(int j=1; j<n;j++){
        for(int k=0; k<j; k++){
           System.err.print(" ");
        }
        for(int k=0; k<n-j; k++){
          System.err.print("*");
        }
        System.err.println("");
      }   
   }
}