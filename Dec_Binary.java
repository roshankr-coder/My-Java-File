public class Dec_Binary {
    public static void main(String[] args) {
        int decimal = 42; // Example decimal number
        System.out.println("Decimal: " + decimal);
        // String binary = Integer.toBinaryString(decimal);
        int ans =0, pow =1;
        while(decimal>0){
            int rem = decimal%2;
            ans += rem*pow;
            pow *= 10;
            decimal /= 2;
        }
        System.out.println("Binary: " + ans);
    }
}