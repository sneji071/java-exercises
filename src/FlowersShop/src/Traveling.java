import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){

            double minBudget = Double.parseDouble(scanner.nextLine());
            double neededSum = 0;
            for (double i = minBudget; i > neededSum; ) {
                neededSum += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}



