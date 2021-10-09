import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberEasterCakes = Integer.parseInt(scanner.nextLine());
        String bestBakerName = "";
        int bestBackerPoint = 0;


        for (int i = 1; i <= numberEasterCakes; i++) {
            String nameBacer = scanner.nextLine();
            String rate = scanner.nextLine();
            int point = 0;
            while (!rate.equals("Stop")) {
                point += Integer.parseInt(rate);

                rate = scanner.nextLine();
            }
            System.out.printf("%n%s has %d points.", nameBacer, point);
            if (point > bestBackerPoint) {
                bestBakerName = nameBacer;
                bestBackerPoint = point;
                System.out.printf("%n%s is the new number 1!", nameBacer);
            }

        }
System.out.printf("%n%s won competition with %d points!", bestBakerName, bestBackerPoint);


    }
}