import java.util.Scanner;

public class KartCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String tous = scanner.nextLine();
        boolean fanCard = scanner.nextLine().equals("yes");
        String typeCard = scanner.nextLine();

        double price = 0.0;

        switch (typeCard) {
            case "Child":
                switch (tous) {
                    case "five":
                        price = 7.0;
                        break;
                    case "ten":
                        price = 11.0;
                        break;
                }
                break;
            case "Junior":
                switch (tous) {
                    case "five":
                        price = 9.0;
                        break;
                    case "ten":
                        price = 16.0;
                        break;
                }
                break;
            case "Adult":
                switch (tous) {
                    case "five":
                        price = 12.0;
                        break;
                    case "ten":
                        price = 21.0;
                        break;
                }
                break;
            case "Profi":
                switch (tous) {
                    case "five":
                        price = 18.0;
                        break;
                    case "ten":
                        price = 32.0;
                        break;
                }
                break;
        }

        if (fanCard) {
            price *= 0.8;
        }
        if (price <= sum && tous.equals("ten")) {
            System.out.printf("You bought %s ticket for ten laps. Your change is %.2flv.", typeCard,  sum-price);
        }
        if(price <= sum && tous.equals("five")){
            System.out.printf("You bought %s ticket for five laps. Your change is %.2flv.",typeCard,sum-price);

        }else if(price > sum){
            System.out.printf("You don't have enough money! You need %.2flv more.", price-sum);
        }


    }
}

