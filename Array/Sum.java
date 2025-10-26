public class Sum{
  public static void main(String[] args) {
      int Array[] = {1,5,10,25};
      int sum =0;
      for(int i=0;i<Array.length;i++){
        sum += Array[i];
      }
      System.err.print(sum);
  }
}