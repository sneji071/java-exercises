import java.util.Scanner;

public class PcGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double hearthstoneCount = 0;
        double forniteCount = 0;
        double overwatchCount = 0;
        double othersCount = 0;


        for (int i = 0; i < n; i++) {
            String nameGame = scanner.nextLine();
            switch (nameGame) {
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    forniteCount++;
                    break;
                case "Overwatch":
                    overwatchCount++;
                    break;
                default:
                    othersCount++;
                    break;
            }
        }

        //    double percentH = hearthstoneCount * 1.0 / number * 100;
        //    double percentF = forniteCount * 1.0 / number * 100;
        //    double percentO = overwatchCount * 1.0 / number * 100;
        //    double percentOth = othersCount * 1.0/ number * 100;


        System.out.printf("%nHearthstone - %.2f%%", hearthstoneCount * 1.00 / n * 100);
        System.out.printf("%nFornite - %.2f%%", forniteCount * 1.0 / n * 100);
        System.out.printf("%nOverwatch - %.2f%%", overwatchCount * 1.0 / n * 100);
        System.out.printf("%nOthers - %.2f%%", othersCount * 1.00 / n * 100);
    }

}