/* 
                    *   
                   * *  
                  *   *  
                 *******
*/ 
public class Pattern14{
   public static void main(String[] args) {
       int n=5;
       for(int i=0; i<n; i++){
        for(int j=0; j<n-i; j++){
           System.out.print(" ");
        }
        for(int j=0; j<=2*i; j++){
          if(i==n-1){
            System.err.print("*");
          }
          else{
            if(j==0 || j>=2*i){
              System.err.print("*");
            }
            else{
              System.err.print(" ");
            }
          }
        }
        System.err.println("");
       }
   }
}