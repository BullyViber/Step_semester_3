import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double total = 0;

        for (int i = 0; i < N; i++) {

            String customerType = sc.next();
            double amount = sc.nextDouble();

            double finalAmount;

            if (customerType.equals("STUDENT")) {
                finalAmount = amount - (amount * 10 / 100);
            }
            else if (customerType.equals("STAFF")) {
                finalAmount = amount - (amount * 5 / 100);
            }
            else {
                finalAmount = amount + 10;
            }

            System.out.println(customerType + ": " + finalAmount);

            total = total + finalAmount;
        }

        System.out.println("Total: " + total);

        sc.close();
    }
}