import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTeam = scanner.nextLine();
        int numberGame = Integer.parseInt(scanner.nextLine());

        int totalDots = 0;
        int totalWinds = 0;
        int totalDraws = 0;

        for (int i = 0; i < numberGame; i++) {
            String gameType = scanner.nextLine();
            if (gameType.equals("W")) {
                totalDots += 3;
                totalWinds++;

            } else if (gameType.equals("D")) {
                totalDots += 1;
                totalDraws++;
            }
        }

        if (numberGame == 0) {
            System.out.printf("%n%s hasn't played any games during this season.", nameTeam);
        } else {
            double percentWinRate = totalWinds * 1.0 / numberGame * 100;

            System.out.printf("%n%s has won %d points during this season.", nameTeam, totalDots);
            System.out.printf("%nTotal stats:");
            System.out.printf("%n## W: %d", totalWinds);
            System.out.printf("%n## D: %d", totalDraws);
            System.out.printf("%n## L: %d", numberGame - totalWinds - totalDraws);
            System.out.printf("%nWin rate: %.2f%%", percentWinRate);
        }

    }
}
