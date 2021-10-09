import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double sumDish = chickenMenu * 10.35 + fishMenu * 12.40 + veganMenu * 8.15;
        double sumDessert = sumDish * 0.20;
        double totalSum = sumDish + sumDessert + 2.50;
        System.out.printf("%nTotal: %.2f", totalSum);
    }
}

