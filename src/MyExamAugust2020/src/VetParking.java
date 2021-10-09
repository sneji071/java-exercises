import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 1; i <= day; i++) {

            double totalDays = 0;
            double hoursSum = 0;

            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    hoursSum = 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    hoursSum = 1.25;
                } else {
                    hoursSum = 1.00;
                }
                totalSum += hoursSum;
                totalDays += hoursSum;

            }
            System.out.printf("%nDay: %d - %.2f leva", i, totalDays);

        }


        System.out.printf("%nTotal: %.2f leva", totalSum);
    }


}
