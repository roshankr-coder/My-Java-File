public class Table {
    public static void main(String[] args) {
        int num = 5; // Example number to generate the table for
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}