import java.util.Scanner;

public class FlowersShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberMagnolias = Integer.parseInt(scanner.nextLine());
        int numberHyacinths = Integer.parseInt(scanner.nextLine());
        int numberRoses = Integer.parseInt(scanner.nextLine());
        int numberCacti = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double sum = numberMagnolias*3.25 + numberHyacinths*4 + numberRoses*3.50 +
                numberCacti*8;
        double totalSum = sum * 0.95;
         if (totalSum >=priceGift) {
             System.out.printf("She is left with %.0f leva.", Math.floor(totalSum - priceGift));
         } else {
             System.out.printf("She will have to borrow %.0f leva.", Math.ceil(priceGift-totalSum));

         }
    }
}
