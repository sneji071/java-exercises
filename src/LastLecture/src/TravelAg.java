import java.util.Scanner;

public class TravelAg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sity = scanner.nextLine();
        String pack = scanner.nextLine();
        boolean vip = scanner.nextLine().equals("yes");
        int day = Integer.parseInt(scanner.nextLine());

        double priceDay = 0.0;
        boolean isValid = false;

        if (day > 7) {
            day--;
        }
        switch (sity) {
            case "Bansko":
            case "Borovets":
                if (vip) {
                    if (pack.equals("withEquipment")) {
                        priceDay = 100 * 0.90;
                    }
                    else if (pack.equals("noEquipment")){
                        priceDay = 80 * 0.95;

                    } else{
                        isValid=true;
                    }
                } else  {
                    if (pack.equals("withEquipment")) {
                    priceDay = 100;

            } else  if (pack.equals("noEquipment")){
                        priceDay = 80;
                } else {
                    isValid = true;

                }
                }
            break;
            case "Varna":
            case "Burgas":
                if (vip) {
                    if (pack.equals("withBreakfast")){
                        priceDay = 130 * 0.88;
                } else  if (pack.equals("noBreakfast")){
                        priceDay = 100 * 0.93;
                } else {
                   isValid= true; }
                } else {
                   if (pack.equals("withBreakfast")) {
                        priceDay = 130;
                    } else if
                     (pack.equals("noBreakfast"))
                        priceDay = 100;
                    else {
                    isValid = true; }
                }
                break;
            default:
                    isValid = true;
                    break;

        }
        if (isValid) {
            System.out.println("Invalid input!");
        } else  if (day < 1) {
            System.out.println("Days must be positive number!");
        } else {
            double totalSum = day * priceDay;
           System.out.printf("The price is %.2flv! Have a nice time!", totalSum);
        }

    }

}




