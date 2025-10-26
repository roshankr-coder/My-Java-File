/*
n=3
**
***
****
****
***
**
*/


public class Pattern11{
   public static void main(String[] args){
     int n=3;
     for(int i=1; i<=n; i++){
       for(int j=0; j<=i; j++){
        System.err.print("*");
       }
       System.err.println("");
     }
     for(int i=1; i<=n; i++){
        for(int j=n+1; j>=i; j--){
          System.err.print("*");
        }
        System.err.println("");
     }
   }
}
