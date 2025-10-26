public class Max_Min{
  public static void main(String[] args) {
      int element[] = {7,8,4,9,3,15,12};
      int min = element[0];
      int max = element[0];
      for(int i=0; i<element.length; i++){
        if(element[i]<min){
          min = element[i];
        }
        if(element[i]>max){
          max = element[i];
        }
      }
      System.err.println("Maximun is: "+max);
      System.err.println("Minimun is: "+min);
  }
}