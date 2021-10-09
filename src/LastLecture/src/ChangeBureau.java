import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBitcoins = Integer.parseInt(scanner.nextLine());
        double numberYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double resultBgn = (numberBitcoins * 1168 + numberYuan * 0.15 * 1.76) / 1.95;
        double totalSum = resultBgn - resultBgn*commission/100;

        System.out.printf("%.2f", totalSum);



    }
}
