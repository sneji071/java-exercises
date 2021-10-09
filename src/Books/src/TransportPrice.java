import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int kilo = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double taxiStart = 0.70;
        double taxiDay = 0.79;
        double taxiNight = 0.90;
        double bus = 0.09;
        double train = 0.06;

        double minPrice = 0;

        if (kilo < 20 && "day".equals(time)) {
            minPrice = taxiStart + taxiDay * kilo;

        } else if (kilo < 20 && "night".equals(time)) {
                minPrice = taxiStart + taxiNight * kilo * 1.00;

        } else if (kilo >= 20 && kilo < 100) {
                minPrice = bus * kilo;

            } else if (kilo >= 100) {
                minPrice = train * kilo;


            }


            System.out.printf("%.2f", minPrice);

        }


    }




