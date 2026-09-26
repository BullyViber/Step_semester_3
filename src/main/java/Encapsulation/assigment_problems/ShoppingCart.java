import java.util.Scanner;

class Cart {
    private double[] prices;
    private int size;
    private final String cartId;

    Cart(String cartId, int maxItems) {
        this.cartId = cartId;
        prices = new double[maxItems];
        size = 0;
    }

    public void addItem(double price) {
        if (size < prices.length) {
            prices[size] = price;
            size++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < size; i++) {
            total = total + prices[i];
        }

        return total;
    }

    public int getItemCount() {
        int count = 0;

        for (int i = 0; i < size; i++) {
            count++;
        }

        return count;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cart ID: ");
        String id = sc.nextLine();

        System.out.print("Enter maximum number of items: ");
        int maxItems = sc.nextInt();

        Cart cart = new Cart(id, maxItems);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            double price = sc.nextDouble();

            cart.addItem(price);
        }

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());

        sc.close();
    }
}