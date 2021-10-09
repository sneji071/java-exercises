import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sity = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        double priceDay = 0.0;


        if (day > 7) {
            day--;

        }

        switch (sity) {
            case "Bansko":
            case "Borovets":
                if (pack.equals("withEquipment")) {
                    switch (vip) {
                        case "no":
                            priceDay = 100;
                            break;
                        case "yes":
                            priceDay = 100 * 0.90;
                            break;

                    }
                } else if (pack.equals("noEquipment")) {
                    switch (vip) {
                        case "no":
                            priceDay = 80;
                            break;
                        case "yes":
                            priceDay = 80 * 0.95;
                            break;

                    }

                } else {
                    isValid = true;
                    break;
                }
                break;
            case "Varna":
            case "Burgas":
                if (pack.equals("withBreakfast")) {
                    switch (vip) {
                        case "no":
                            priceDay = 130;
                            break;
                        case "yes":
                            priceDay = 130 * 0.88;
                            break;

                    }
                } else if (pack.equals("noBreakfast")) {
                    switch (vip) {
                        case "no":
                            priceDay = 100;
                            break;
                        case "yes":
                            priceDay = 100 * 0.93;
                            break;

                    }
                } else {
                    isValid = true;
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
            double finalPrice = day * priceDay;
            System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
        }

    }
}