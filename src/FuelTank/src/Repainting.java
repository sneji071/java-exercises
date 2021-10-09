import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int pain = Integer.parseInt(scanner.nextLine());
        int phinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceNylon = 1.50 * (nylon + 2);
        double pricePain = 14.50 * pain * 1.1;
        double pricePhinner = 5.00 * phinner;
        double totalSum = priceNylon + pricePain + pricePhinner + 0.40;
        double sumMastersOneHour = 0.3 * totalSum * hours;
        double rezult = totalSum + sumMastersOneHour;

        System.out.printf("Total expenses: %.2f lv.", rezult);


    }
}
