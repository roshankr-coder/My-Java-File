public class Pattern5{
     public static void main(String[] arg){
        int n=5;
         //Upper helf
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
               System.err.print("*");
            }

            int spaces =2*(n-i);
            for(int j=1; j<=spaces; j++){
               System.err.print(" ");
            }
            for(int j=1; j<=i; j++){
               System.err.print("*");
            }
            System.err.println("");
         }
        
        //Lower helf
         for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
               System.err.print("*");
            }

            int spaces =2*(n-i);
            for(int j=1; j<=spaces; j++){
               System.err.print(" ");
            }
            for(int j=1; j<=i; j++){
               System.err.print("*");
            }
            System.err.println("");
         }      
      }
}