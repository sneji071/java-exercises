import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double latitude = Math.floor(w / 1.20);
        double table = Math.floor((h  - 1.00) / 0.70);
        System.out.printf("%.0f", table * latitude - 3);

    }

}
