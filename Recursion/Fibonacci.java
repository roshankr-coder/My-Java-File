public class Fibonacci{
   public static void Fibo(int a, int b, int n) {
        if(n==0){
           return ;
        }
        int c = a+b;
        System.err.print(c+" ");
        Fibo(b,c,n-1);
   }
   public static void main(String[] args) {
       int a=0, b=1;
       System.err.print(a+" ");
       System.err.print(b+" ");
       int n=9;
       Fibo(a, b, n-2);
   }
}