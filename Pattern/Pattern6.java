public class Pattern6{
  public static void main(String[] args) {
      int n=6;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
          System.err.print(" ");
        }
        for (int k=1; k<=n; k++) {
            System.err.print("*");
        }
        System.err.println("");
      }
  }
}