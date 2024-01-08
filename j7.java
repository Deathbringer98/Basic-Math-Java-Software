import java.util.Scanner;

public class j7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = scanner.nextInt();
                    System.out.println("Binary representation: " + decimalToBinary(decimalNumber));
                    break;
                case 2:
                    System.out.print("Enter a binary number: ");
                    String binaryNumber = scanner.next();
                    System.out.println("Decimal representation: " + binaryToDecimal(binaryNumber));
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
            }

        } while (option != 3);

        scanner.close();
    }

    private static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    private static int binaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }
}
