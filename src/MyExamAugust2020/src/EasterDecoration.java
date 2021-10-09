import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int costumers = Integer.parseInt(scanner.nextLine());

       // double oneBasket = 0; //1.50
       // double oneWreath = 0;//3.80;
       // double oneBunny = 0;//7.0;
        double totalSumCostumers = 0.0;

        for (int i = 1; i<=costumers; i++){
            String buy = scanner.nextLine();
            double priceOne = 0.0;
            int contProducts = 0;
            while (!buy.equals("Finish")){
                contProducts ++;
                if (buy.equals("basket")){
                    priceOne += 1.50;
                }
                if (buy.equals("wreath")){
                    priceOne += 3.80;
                }
                if (buy.equals("chocolate bunny")){
                    priceOne += 7.0;
                }
                buy = scanner.nextLine();
            }
            if (contProducts %2 == 0){
                priceOne = priceOne * 0.80;
            }
            System.out.printf("%nYou purchased %d items for %.2f leva.", contProducts, priceOne);
            totalSumCostumers += priceOne;
        }
        System.out.printf("%nAverage bill per client is: %.2f leva.", totalSumCostumers/costumers);
    }
}
