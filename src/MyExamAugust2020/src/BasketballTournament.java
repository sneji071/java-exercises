import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int shok = 0;
        int victory = 0;
        int numberGame = 0;

        while (!name.equals("End of tournaments")) {
            int game = Integer.parseInt(scanner.nextLine());
            numberGame += game;
            for (int i = 1; i <= game; i++) {
                int myPip = Integer.parseInt(scanner.nextLine());
                int therePip = Integer.parseInt(scanner.nextLine());
                if (myPip > therePip) {
                    victory++;
                    System.out.printf("%nGame %d of tournament %s: win with %d points.", i, name, myPip - therePip);
                } else {
                    shok++;
                    System.out.printf("%nGame %d of tournament %s: lost with %d points.", i, name, Math.abs(myPip - therePip));
                }

            }
            name = scanner.nextLine();
        }

        double percentVictory = victory * 1.0 / numberGame * 100;
        double percentShok = shok * 1.0 / numberGame * 100;

        System.out.printf("%n%.2f%% matches win%n", percentVictory);
        System.out.printf("%.2f%% matches lost%n", percentShok);

    }
}