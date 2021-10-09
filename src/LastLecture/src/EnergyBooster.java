import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numberPack = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double numberSize = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    numberSize = 2;
                    price = 56;
                } else if (size.equals("big")) {
                    numberSize = 5;
                    price = 28.70;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    numberSize = 2;
                    price = 36.66;
                } else if (size.equals("big")) {
                    numberSize = 5;
                    price = 19.6;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    numberSize = 2;
                    price = 42.1;
                } else if (size.equals("big")) {
                    numberSize = 5;
                    price = 24.8;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    numberSize = 2;
                    price = 20;
                } else if (size.equals("big")) {
                    numberSize = 5;
                    price = 15.2;
                }
                break;
        }
        double totalSum = numberSize * price * numberPack;
        if (totalSum >= 400 && totalSum <= 1000) {
            totalSum *= 0.85;

        } else if (totalSum > 1000) {
            totalSum *= 0.5;
        }

        System.out.printf("%.2f lv.", totalSum);

    }


}





