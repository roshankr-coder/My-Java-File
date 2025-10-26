public class Pattern19{
   public static void main(String[] args){
       int n=6;
       for(int i=0;i<n;i++){
         for(int j=0;j<n-i;j++){
          System.err.print(" ");
         }
         for(int j=0;j<1;j++){
          System.err.print("*");
         } 
         for(int k=0;k<2*i-1;k++){
          System.err.print(" ");
         }
         if(i>0){
           for(int j=0;j<1;j++){
             System.err.print("*");
           }
         }
         System.err.println("");
       }
       for(int i=0;i<n-1;i++){
         for(int j=0;j<=i+1;j++){
           System.err.print(" ");
         }
         for(int j=0;j<1;j++){
           System.err.print("*");
         }
         for(int j=0;j<2*n-4-2*i-1;j++){
          System.err.print(" ");
         }
         if(i<4)
            for(int j=0;j<=0;j++){
          System.err.print("*");
         }
         
         System.err.println("");
       }
   }
}