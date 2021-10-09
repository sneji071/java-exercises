import java.util.Scanner;

public class FaceTrapece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double b3 = Double.parseDouble(scanner.nextLine());

        double face = (b1 + b2) * b3 * 0.5 ;

        System.out.printf("%.2f", face);
    }
}
