import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int card = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double totalSum = 250 * card + 0.35 * 250 * card * processor + 0.10 * 250 * card * ram;
        if (card > processor) {
            totalSum = 0.85 * totalSum;
        }
            if (budget >= totalSum) {
                System.out.printf("You have %.2f leva left!", budget - totalSum);
            } else {
                System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
            }

        }


    }
