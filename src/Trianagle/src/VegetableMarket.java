import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKiloVegetables = Double.parseDouble(scanner.nextLine());
        double priceKiloFruit = Double.parseDouble(scanner.nextLine());
        int quantityVegetables = Integer.parseInt(scanner.nextLine());
        int quantutyFruit = Integer.parseInt(scanner.nextLine());

        double income = (priceKiloVegetables * quantityVegetables +
                priceKiloFruit * quantutyFruit) / 1.94 ;

        System.out.printf("%.2f", income);

    }
}
