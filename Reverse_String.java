public class Reverse_String{
    public static void main(String[] args) {
        String st = "Roshan kumar";
        int a = st.length();
        String reverse_st ="";
        for(int i=a-1;i>=0;i--){
             reverse_st = reverse_st + st.charAt(i);
        }
        System.err.println("Original String: "+st);
        System.err.println("Reverse String: "+reverse_st);

    }
}