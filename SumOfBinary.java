
import java.util.*;

public class SumOfBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Binary Number: ");
        long binary1 = sc.nextLong();
        System.out.print("Enter the Second Binary Number: ");
        long binary2 = sc.nextLong();
        int i = 0, remainder = 0;
        int[] sum = new int[20];

        // Perform binary addition while there are digits in the binary numbers
        while (binary1 != 0 || binary2 != 0) {
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        // If there is a remaining carry, add it to the sum
        if (remainder != 0) {
            sum[i++] = remainder;
        }

        // Decrement the index to prepare for printing
        --i;

        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

    }
}