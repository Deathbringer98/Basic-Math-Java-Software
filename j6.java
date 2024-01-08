import java.util.Scanner;

public class j6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int[] frequencies = new int[10];

        for (int i = 0; i < 100; i++) {
            numbers[i] = sc.nextInt();
            frequencies[numbers[i]]++;
        }

        System.out.println("Number\tFrequency");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "\t" + frequencies[i] + " times");
        }

        sc.close();
    }
}