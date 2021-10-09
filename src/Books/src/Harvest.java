import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int areaVineyard = Integer.parseInt(scanner.nextLine());
        double grapesOneMeters = Double.parseDouble(scanner.nextLine());
        int litersWine = Integer.parseInt(scanner.nextLine());
        int numberWorkers = Integer.parseInt(scanner.nextLine());


        double harvestLiters = 0.4 * areaVineyard * grapesOneMeters/ 2.5 ;


        if (harvestLiters < litersWine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.floor(litersWine - harvestLiters));
        } else {
            double wineOneWolker = (harvestLiters - litersWine) / numberWorkers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.",
                    Math.floor(harvestLiters));

              System.out.printf("%n%.0f liters left -> %.0f liters per person.",
                                      Math.ceil(harvestLiters - litersWine),
                                        Math.ceil(wineOneWolker));
        }

    }

}