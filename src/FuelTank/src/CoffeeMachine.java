import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberDrinks = Integer.parseInt(scanner.nextLine());

        double totalSum = 0.0;

        if ("Without".equals(sugar)) {
            switch (drink) {
                case "Espresso":
                    totalSum = 0.90 * numberDrinks;
                   if (numberDrinks >= 5)
                   // if(totalSum >= 5)
                        totalSum = totalSum * 0.75;
                    break;
                case "Cappuccino":
                    totalSum = 1.00 * numberDrinks;
                    break;
                case "Tea":
                    totalSum = 0.50 * numberDrinks;
                    break;
            }
            totalSum -= 0.35 * totalSum;
        }

        if ("Normal".equals(sugar)) {
            switch (drink) {
                case"Espresso":
                    totalSum = 1.00 * numberDrinks;
                    if (numberDrinks >= 5)
                //    if(totalSum >= 5)
                        totalSum = totalSum * 0.75;
                    break;
                case"Cappuccino":
                    totalSum = 1.20 * numberDrinks;
                    break;
                case"Tea":
                    totalSum = 0.60 * numberDrinks;
                    break;
            }
        }
        if ("Extra".equals(sugar)) {
            switch (drink) {
                case"Espresso":
                    totalSum = 1.20 * numberDrinks;
                    if (numberDrinks >= 5)
                   // if(totalSum >= 5)
                        totalSum = totalSum * 0.75;
                    break;
                case"Cappuccino":
                    totalSum = 1.60 * numberDrinks;
                    break;
                case"Tea":
                    totalSum = 0.70 * numberDrinks;
                    break;
            }
        }
        if (totalSum > 15.00) {
            totalSum -= 0.20 * totalSum;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.",numberDrinks,drink,totalSum);

    }

}




