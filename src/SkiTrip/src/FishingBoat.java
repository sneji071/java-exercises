import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

            double totalSum = 0;
        switch (season) {
            case "Spring":
                totalSum = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalSum = 4200;
                break;
            case "Winter":
                totalSum = 2600;
                break;
        }

            if (fishermanCount <=6) {
                totalSum *= 0.9;
            } else if (fishermanCount <= 11){
                totalSum *= 0.85;

            } else {
                totalSum *= 0.75;
            }
            if (fishermanCount %2 ==0 && !season.equals("Autumn")){
                totalSum *= 0.95;
            }
            if (totalSum <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", Math.abs(totalSum - budget));
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", Math.abs(totalSum - budget));
            }
    }
}
