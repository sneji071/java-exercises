import java.util.Scanner;

public class PCStoreExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int priceProcessor = Integer.parseInt(scan.nextLine());
        int priceVideoCard = Integer.parseInt(scan.nextLine());
        int priceRam = Integer.parseInt(scan.nextLine());
        int numbersRam = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double totalPriceProcessor = priceProcessor * 1.57;
        double totalPriceVideoCard = priceVideoCard * 1.57;
        double totalPriceRam = priceRam * 1.57;
        double resultPriceRam = totalPriceRam * numbersRam;
        double resultPriceProcessor = totalPriceProcessor - totalPriceProcessor * percent;
        double resultPriceVideoDard = totalPriceVideoCard - totalPriceVideoCard * percent;

        double money = resultPriceProcessor + resultPriceVideoDard + resultPriceRam;

        System.out.printf("Money needed - %.2f leva.", money);


    }
}
