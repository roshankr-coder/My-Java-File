public class DecToHexa{
   public static void main(String[] args) {
        int decimal = 254; // Example decimal number
        System.out.println("Decimal: " + decimal);
        String hexa = "";
        char hexChars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(decimal > 0){
            int rem = decimal % 16;
            hexa = hexChars[rem] + hexa;
            decimal /= 16;
        }
        System.out.println("Hexadecimal: " + hexa);
   }
}