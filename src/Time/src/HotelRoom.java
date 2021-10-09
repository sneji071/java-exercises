import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberNight = Integer.parseInt(scanner.nextLine());

        double priceApartament = 0;
        double priceStudio = 0;

        switch (month) {
            case "May":
            case "October":
                priceApartament = numberNight * 65;
                priceStudio = numberNight * 50;
                if (numberNight > 7 && numberNight <= 14) {
                    priceStudio = numberNight * 50 * 0.95;
                } else if (numberNight > 14) {
                    priceApartament = numberNight * 65 * 0.9;
                    priceStudio = numberNight * 50 * 0.70;
                }
                break;

            case "June":
            case "September":
                priceApartament = numberNight * 68.70;
                priceStudio = numberNight * 75.20;
                if (numberNight > 14) {
                    priceApartament = numberNight * 68.70 * 0.9;
                    priceStudio = numberNight * 75.20 * 0.8;
                }
                break;

            case "July":
            case "August":
                priceApartament = numberNight * 77;
                priceStudio = numberNight * 76;
                if (numberNight > 14)
                    priceApartament = numberNight * 77 * 0.9;

                break;
        }

                System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", priceApartament, priceStudio);
            }


        }




