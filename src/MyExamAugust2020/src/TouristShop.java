import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        //     String command = scanner.nextLine();
        //     double priceoOneProduct = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0.0;
        int productNumber = 0;

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            double priceoOneProduct = Double.parseDouble(scanner.nextLine());
            productNumber++;
            if (productNumber % 3 == 0) {
                priceoOneProduct *= 1 / 2.0;
            }
            if (budget >= priceoOneProduct) {
                budget -= priceoOneProduct;
                totalPrice += priceoOneProduct;
            } else {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", priceoOneProduct - budget);
                break;

            }
            command = scanner.nextLine();

        }
        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", productNumber, totalPrice);
        }

    }
}

