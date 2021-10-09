import java.util.Scanner;

public class AgemcyTravel {
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
            case"Bansko":
            case"Borovets":
                if (pack.equals("withEquipment") && vip.equals("no")) {
                    priceDay = 100;
                }else if (vip.equals("yes")) {
                    priceDay -= 100 * 0.10;
                }else if (pack.equals("noEquipment")&& vip.equals("no")) {
                    priceDay = 80;
                } else if (vip.equals("yes")){
                    priceDay  -= 80 * 0.05;
                } else {
                    isValid = true;
                }
                break;

            case"Varna":
            case "Burgas":
                if (pack.equals("withBreakfast")&& vip.equals("no")) {
                    priceDay = 130;
                } else if (vip.equals("yes")) {
                    priceDay -= 130 * 0.12;
                } else if (pack.equals("noBreakfast")&& vip.equals("no")) {
                    priceDay = 100;
                }else if (vip.equals("yes")){
                    priceDay -= 100 * 0.07;
                }else{
                    isValid = true;
                }
                break;
            default:
                isValid = true;
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
