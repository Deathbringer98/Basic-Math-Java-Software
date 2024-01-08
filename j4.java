import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (-999 to stop): ");
        do {
            number = sc.nextInt();
            if (number != -999) {
                sum += number;
                count++;
            }
        } while (number != -999);
        if (count > 0) {
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + (double) sum / count);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}