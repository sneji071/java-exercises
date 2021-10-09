import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesDayOneWalks = Integer.parseInt(scanner.nextLine());
        int numberWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutesDayOneWalks * numberWalks;
        double burnetCalories = totalMinutes * 5;
        double percentCalories = calories * 0.50;

        if (burnetCalories >= percentCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", burnetCalories);
        }else if(burnetCalories < percentCalories){
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.",burnetCalories);
        }
    }
}
