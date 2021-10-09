import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String sity = scanner.nextLine();
        String typePack = scanner.nextLine();
        String vip = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        double priceOneDay = 0;


        if (day > 7) {
            day--;
        }
        switch (sity) {
            case "Bansko":
            case "Borovets":
                if (vip.equals("yes")) {
                    if (typePack.equals("noEquipment"))
                        priceOneDay = 80 * 0.95;
                } else if (typePack.equals("withEquipment")) {
                    priceOneDay = 100 * 0.90;
                } else {
                    isValid = true;
                }

        if (vip.equals("no")) {
                    if (typePack.equals("noEquipment")) {
                        priceOneDay = 80;
                    } else if (typePack.equals("withEquipment")) {
                        priceOneDay = 100;
                    } else {
                        isValid = true;
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (vip.equals("yes")) {
                    if (typePack.equals("noBreakfast"))
                        priceOneDay = 100 * 0.93;
                } else if (typePack.equals("withBreakfast")) {
                    priceOneDay = 130 * 0.88;
                } else {
                    isValid = true;
                }
                if (vip.equals("no")) {
                    if (typePack.equals("noBreakfast")) {
                        priceOneDay = 100;
                    } else if (typePack.equals("withBreakfast")) {
                        priceOneDay = 130;
                    } else {
                        isValid = true;
                    }
                }
                break;
            default:
                isValid = true;
                break;
        }
        if (isValid) {
            System.out.println("Invalid input!");
        } else if (day < 1) {
            System.out.println("Days must be positive number!");
        } else {
            double finalPrice = day * priceOneDay;
            System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
        }
    }
}





