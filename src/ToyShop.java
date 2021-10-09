import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzelsCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truksCount = Integer.parseInt(scanner.nextLine());

        int totalCount = puzzelsCount + dollsCount + teddyCount + minionsCount + truksCount;

        double puzzelsPrice = puzzelsCount * 2.60;
        double dollsPrice = dollsCount * 3.0;
        double teddyPrice = teddyCount * 4.10;
        double minionsPrice = minionsCount * 8.20;
        double truksPrice = truksCount * 2.0;

        double totalPrice = puzzelsPrice + dollsPrice + teddyPrice + minionsPrice + truksPrice;
        if (totalCount >= 50) {
            totalPrice = totalPrice - totalPrice * 0.25;
        }
            totalPrice = totalPrice - totalPrice * 0.1;


        if (totalPrice >= excursionPrice) {

            System.out.printf("Yes! %.2f lv left.", Math.abs(excursionPrice - totalPrice));
            } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(excursionPrice - totalPrice));
        }
    }

}
