public class Selection {
  public static void printArray(int arr[]){
     for(int i=0; i<arr.length; i++){
       System.err.print(arr[i]+" ");
     }
   }
   public static void main(String[] args){
      int arr[] = {3,6,2,7,4,10};
      int n = arr.length;
      for(int i=0; i<n-1; i++){
        int smallest =i;
        
        for(int j=i+1; j<n; j++){
           if(arr[smallest]>arr[j]){
            smallest= j;
           }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i]= temp;
      }
      printArray(arr);
   }
}