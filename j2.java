public class j2 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 8, num3 = 1, num4 = 12, num5 = 6;
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        if (num5 > max) {
            max = num5;
        }
        System.out.println("The largest number is: " + max);
    }
}