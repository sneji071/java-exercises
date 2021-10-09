import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double priceSunbed = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double umbrella = Math.ceil(people / 2.0);
        double sunbed = Math.ceil(0.75 * people);
        double totalPrise = people * fee + umbrella * priceUmbrella + sunbed * priceSunbed ;

        System.out.printf("%.2f lv.",totalPrise);





    }
}
