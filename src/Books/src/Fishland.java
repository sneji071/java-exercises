import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKiloMackerel = Double.parseDouble(scanner.nextLine());
        double priceKiloSprot = Double.parseDouble(scanner.nextLine());
        double kilosBonito = Double.parseDouble(scanner.nextLine());
        double kilosScad = Double.parseDouble(scanner.nextLine());
        int kilosMussels =  Integer.parseInt(scanner.nextLine());

        double priceKiloBonoto = 1.60 * priceKiloMackerel;
        double priceKiloScad = 1.80 * priceKiloSprot;

        double sum = kilosMussels * 7.50 + kilosScad * priceKiloScad +
                kilosBonito * priceKiloBonoto;

        System.out.printf("%.2f", sum);

    }
}




