import java.util.Scanner;

public class MyAgency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sity = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int day = Integer.parseInt(scanner.nextLine());

        double priceDay = 0;
        boolean isValid = false;

        if (day > 7) {
            day--;
        }

        switch (sity) {
            case "Bansko":
            case "Borovets":
                if (pack.equals("withEquipment")) {
                    if (vip.equals("no")) {
                        priceDay = 100;
                    } else if (vip.equals("yes")) {
                        priceDay = 100 * 0.90;

                    } else {
                        isValid = true;
                    }
                } else if (pack.equals("noEquipment")) {
                    if (vip.equals("no")) {
                        priceDay = 80;
                    } else if (vip.equals("yes")) {
                        priceDay = 80 * 0.95;
                    }
                } else {
                    isValid = true;
                }
                break;
            case "Varna":
            case "Burgas":
                if (pack.equals("withBreakfast")) {
                    if (vip.equals("no")) {
                        priceDay = 130;
                    } else if (vip.equals("yes")) {
                        priceDay = 130 * 0.88;

                    } else {
                        isValid = true;

                    }

                } else if (pack.equals("noBreakfast")) {
                    if (vip.equals("no")) {
                        priceDay = 100;
                    } else if (vip.equals("yes")) {
                        priceDay = 100 * 0.93;
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
            System.out.printf("The price is %.2flv! Have a nice time!", day * priceDay);
        }


    }

}