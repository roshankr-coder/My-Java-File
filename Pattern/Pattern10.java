public class Pattern10{
   public static void main(String[] args){
       int n=5;

      //  Upper
       for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            if(j==1 || j==i){
              System.err.print("*");
            }else{
              System.err.print(" ");
            }
          }


          for(int j=1; j<=2*n-2*i; j++){
             System.err.print(" ");
          }
          for(int j=1; j<=i; j++){
            if(j==1 || j==i){
              System.err.print("*");
            }else{
              System.err.print(" ");
            }
          }
          System.err.println("");
       }
       //Lower

       for(int i=n; i>=1; i--){
         for(int j=1; j<=i; j++){
           if(j==1 || j==i){
             System.err.print("*");
           }else{
             System.err.print(" ");
           }
         }
         int s=2*n-2*i;
        for(int j=1;j<=s;j++){
          System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        if(j==i||j==1){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
         System.err.println("");
       }
   }

}