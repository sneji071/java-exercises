import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int day = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0;

        switch (room) {
            case "room for one person":
                price = 18 * (day - 1);
                break;

            case "apartment":
                if (day < 10) {
                    price = 25 * (day - 1) * 0.7;
                } else if (10 <= day && day <= 25) {
                    price = 25 * (day - 1) * 0.65;
                } else if (day > 25) {
                    price = 25.00 * (day - 1) * 0.5;
                }
                break;

            case "president apartment":
                if (day < 10) {
                    price = 35 * (day - 1) * 0.9;
                } else if (10 <= day && day <= 25) {
                    price = 35 * (day - 1) * 0.85;
                } else if (day > 25) {
                    price = 35 * (day - 1) * 0.8;
                }
                break;
        }

        if (rating.equals("positive"))
            System.out.printf("%.2f", 0.75 * price);
        if (rating.equals("negative"))
            System.out.printf("%.2f, 0.9 * price");
    }

    }





