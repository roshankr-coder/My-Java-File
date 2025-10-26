public class Factorial{
   public static void Fact(int i, int num, int mult){
      if(i==num){
         mult *= i;
         System.err.print(mult);
         return ;
      }
       mult *= i;
       Fact(i+1,num,mult);
   }
   public static void main(String[] args) {
       Fact(1,5,1);
   }
}