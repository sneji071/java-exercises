import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String term = scanner.nextLine();
        String typeTerm = scanner.nextLine();
        boolean net = scanner.nextLine().equals("yes");
        int months = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;

        switch (term) {
            case "one":
                switch (typeTerm) {
                    case "Small":
                        totalPrice = 9.98 * months;
                        if (net) {
                            totalPrice = (9.98 + 5.50) * months;
                        }
                        break;
                    case "Middle":
                        totalPrice = 18.99 * months;
                        if (net) {
                            totalPrice = (18.99 + 4.35) * months;
                        }
                        break;
                    case "Large":
                        totalPrice = 25.98 * months;
                        if (net) {
                            totalPrice = (25.98 + 4.35) * months;
                        }
                        break;
                    case "ExtraLarge":
                        totalPrice = 35.99 * months;
                        if (net) {
                            totalPrice = (35.99 + 3.85) * months;
                        }
                        break;
                }
                System.out.printf("%.2f lv.", totalPrice);
                break;

            case "two":
                switch (typeTerm) {
                    case "Small":
                        totalPrice = 8.58 * months;
                        if (net) {
                            totalPrice = (8.58 + 5.50) * months;
                        }
                        break;
                    case "Middle":
                        totalPrice = 17.09 * months;
                        if (net) {
                            totalPrice = (17.09 + 4.35) * months;
                        }
                        break;
                    case "Large":
                        totalPrice = 23.59 * months;
                        if (net) {
                            totalPrice = (23.59 + 4.35) * months;
                        }
                        break;
                    case "ExtraLarge":
                        totalPrice = 31.79 * months;
                        if (net) {
                            totalPrice = (31.79 + 3.85) * months;
                        }
                        break;
                }
                double result = totalPrice - 0.0375 * totalPrice;
                System.out.printf("%.2f lv.", result);
                break;
        }
    }
}


