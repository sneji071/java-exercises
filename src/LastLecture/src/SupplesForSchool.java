import java.util.Scanner;

public class SupplesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packPens = Integer.parseInt(scanner.nextLine());
        int packMarkers = Integer.parseInt(scanner.nextLine());
        double litersPreparation = Double.parseDouble(scanner.nextLine());
        int percentRebate = Integer.parseInt(scanner.nextLine());

        double sum = packPens * 5.80 + packMarkers * 7.20 + litersPreparation * 1.20;
        double totalSum = sum - sum*percentRebate /100;
        System.out.printf("%.3f", totalSum);


    }
}
