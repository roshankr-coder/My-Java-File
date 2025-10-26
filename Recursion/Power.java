public class Power{
   public static int calPower(int x, int n){
      if(x==0){
         return 0;
      }
      if(n==0){
        return 1;
      }
      int xpowerm1= calPower(x, n-1);
      int xpowern= x * xpowerm1;
      return xpowern;

   }
   public static void main(String[] args){
    int x=6, n=3;
    int result = calPower(x,n);
    System.err.print(result);
   }
} 