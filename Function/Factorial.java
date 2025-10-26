public class Factorial{
  public static int fact(int num){
    int mul = 1;
    for(int i=1; i<=num; i++){
       mul*=i;
    }
    return mul;
  }
  public static void main(String[] args) {
      int z = fact(5);
      System.err.println(z);
  }
}