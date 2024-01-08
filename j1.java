import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a one digit number: ");
        int num = sc.nextInt();
        if (num >= 0 && num <= 9) {
            String word;
            switch (num) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                default:
                    word = "Invalid number!";
                    break;
            }
            System.out.println(word);
        } else {
            System.out.println("Invalid number!");
        }
    }
}