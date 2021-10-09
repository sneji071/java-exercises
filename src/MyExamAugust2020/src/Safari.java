import java.util.Scanner;

public class Safari {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double liters = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double sumFuel = liters * 2.10;
        double priceGuide = 100.0;
        double totalSum = sumFuel + priceGuide;
        switch (day){
            case"Saturday":
                totalSum *= 0.90;
                break;
            case"Sunday":
                totalSum *= 0.80;
                break;
        }
        if (totalSum>=budget) {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalSum-budget);
        } else if (budget > totalSum){
            System.out.printf("Safari time! Money left: %.2f lv.", budget-totalSum);
        }


    }
}