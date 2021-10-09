import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();

        double totalPrice = 0.00;
        double income = 0.00;

        while (!cocktail.equals("Party!")) {
            int number = Integer.parseInt(scanner.nextLine());
            double price = cocktail.length();
            totalPrice = price * number;
            if (totalPrice % 2 != 0) {
                totalPrice = totalPrice - (totalPrice * 0.25);
            }
            income += totalPrice;
            if (income >= money) {
                System.out.println("Target acquired.");
                break;
            }
            cocktail = scanner.nextLine();
        }
        if (cocktail.equals("Party!")) {
            double diff = money - income;
            System.out.printf("We need %.2f leva more.", diff);
        }
        System.out.printf("Club income - %.2f leva.", income);
    }

}
