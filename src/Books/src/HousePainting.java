import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double leigth = Double.parseDouble(scanner.nextLine());
        double heightTrianagle = Double.parseDouble(scanner.nextLine());

        double greenFeet = (2 * height * height) - (1.20 * 2) + (2 * height * leigth) - (2 * 1.5 * 1.5);
        double redFeet = 2 * (height * heightTrianagle / 2) + 2 * (height * leigth);


        double greenLiter = greenFeet / 3.4;
        double redliter = redFeet / 4.3;

        System.out.printf("%.2f %n%.2f", greenLiter, redliter);

    }
}
