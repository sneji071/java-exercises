import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int  numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (typeOfFlowers) {
            case "Roses":
                price = numberOfFlowers * 5.00;
                if (numberOfFlowers > 80) {
                    price = (numberOfFlowers * 5.00) * 0.9;
                }
                break;
            case "Dahlias":
                price = numberOfFlowers * 3.80;
                if (numberOfFlowers > 90) {
                    price = (numberOfFlowers * 3.80) * 0.85;
                }
                break;

            case "Tulips":
                price = numberOfFlowers * 2.80;
                if (numberOfFlowers > 80) {
                    price = (numberOfFlowers * 2.80) * 0.85;
                }
                break;

            case "Narcissus":
                price = numberOfFlowers * 3.00;
                if (numberOfFlowers < 120) {
                    price = (numberOfFlowers * 3.00) * 1.15;
                }
                break;

            case "Gladiolus":
                price = numberOfFlowers * 2.50;
                if (numberOfFlowers < 80) {
                    price = (numberOfFlowers * 2.50) * 1.20;
                }
                break;

        }
                if ( budget >= price) {
                    double moneyLeft = budget - price;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                            numberOfFlowers, typeOfFlowers, moneyLeft);
                } else if (price > budget) {
                    double moneyNeede = price - budget;
                    System.out.printf("Not enough money, you need %.2f leva more.", moneyNeede);


                }

        }


    }

