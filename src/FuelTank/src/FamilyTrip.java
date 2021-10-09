import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberNight = Integer.parseInt(scanner.nextLine());
        double priceNight = Double.parseDouble(scanner.nextLine());
        int percentExtraCosts = Integer.parseInt(scanner.nextLine());


        if (numberNight > 7) {
            priceNight = 0.95 * priceNight;
        }
        double totalPriceNight = priceNight * numberNight;
        double totalPercent = percentExtraCosts * budget / 100;
        double totalPrice = totalPriceNight + totalPercent;

        if (totalPrice > budget) {

            System.out.printf("%.2f leva needed.", totalPrice - budget);

        } else {

            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);


        }

    }

}





