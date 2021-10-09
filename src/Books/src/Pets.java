import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKilo = Integer.parseInt(scanner.nextLine());
        double dogKilo = Double.parseDouble(scanner.nextLine());
        double catKilo = Double.parseDouble(scanner.nextLine());
        double turtleGram = Double.parseDouble(scanner.nextLine());

        double sumFood = (dogKilo + catKilo + turtleGram/1000) * days;

        if (sumFood <= foodKilo ) {
            double left = Math.floor(foodKilo - sumFood) ;
            System.out.printf("%.0f kilos of food left.", left);
        } else if( sumFood > foodKilo){
            double needed = Math.ceil(sumFood - foodKilo);
            System.out.printf("%.0f more kilos of food are needed.", needed);
        }



    }
}
