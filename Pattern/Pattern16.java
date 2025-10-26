/*

3
44
555
6666
555
44
3
*/

class Pattern16{
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++){
          for(int j=0; j<=i; j++){
            System.err.print(3+i);
          }
          System.err.println("");
        }
        for(int j=0; j<n-1; j++){
          for(int k=n-1; k>j; k--){
            System.err.print(n+1-j);
          }
          System.err.println("");
        }
    }
}