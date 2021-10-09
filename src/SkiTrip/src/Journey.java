import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


        double totalSum = 0;
        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");

            switch (season) {
                case "summer":
                    totalSum = budget * 0.3;
                    System.out.printf("Camp - %.2f", totalSum);
                    break;
                case "winter":
                    totalSum = budget * 0.7;
                    System.out.printf("Hotel - %.2f", totalSum);
                    break;
            }


        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");

            switch (season) {
                case "summer":
                    totalSum = budget * 0.4;
                    System.out.printf("Camp - %.2f", totalSum);
                    break;
                case "winter":
                    totalSum = budget * 0.8;
                    System.out.printf("Hotel - %.2f", totalSum);
                    break;
            }


        } else if (budget > 1000) {
            totalSum = budget * 0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", totalSum);

        }


    }


}



