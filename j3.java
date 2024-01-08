public class j3 {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0.05;
        for (int i = 1; i <= 10; i++) {
            double profit = principal * rate;
            double total = principal + profit;
            System.out.println("Year " + i + ": Amount on deposit = " + total);
            principal = total;
        }
    }
}