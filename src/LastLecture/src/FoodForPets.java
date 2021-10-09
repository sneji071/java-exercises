import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDeys = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double dogFood = 0;
        double catFood = 0;
        double biskuits = 0;


        for (int i = 1; i <= numberDeys; i++) {
            int doogFoodOneDay = Integer.parseInt(scanner.nextLine());
            int catFoodOneDay = Integer.parseInt(scanner.nextLine());
            dogFood += doogFoodOneDay;
            catFood += catFoodOneDay;
            if (i % 3 == 0) {
                biskuits += (doogFoodOneDay + catFoodOneDay) * 0.10;
            }

        }
            double perentFood = (dogFood + catFood) / totalFood * 100;
            double percentDogFood = dogFood / (dogFood + catFood) * 100;
            double percentCatFood = catFood / (dogFood + catFood) * 100;


            System.out.printf("Total eaten biscuits: %.0fgr.%n", biskuits);
            System.out.printf("%.2f%% of the food has been eaten.%n", perentFood);
            System.out.printf("%.2f%% eaten from the dog.%n", percentDogFood);
            System.out.printf("%.2f%% eaten from the cat.", percentCatFood);

        }


    }
