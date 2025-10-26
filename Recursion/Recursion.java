public class Recursion{
    public static void Print_Num(int num){
       if(num==0)
         return;
       System.err.println(num);
       Print_Num(num-1);
    }
    public static void main(String[] args) {
        Print_Num(5);
    }
}