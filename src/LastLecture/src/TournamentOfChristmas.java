import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalMoneyEarnest = 0;
        int daysWin = 0;
        int daysLose = 0;

        for (int i = 1; i <= days; i++) {
            double moneyForTheDay = 0;
            int wints = 0;
            int loses = 0;
            String game = scanner.nextLine();

            while (!game.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    moneyForTheDay += 20;
                    wints++;
                } else if (result.equals("lose")) {
                    loses++;
                }
                game = scanner.nextLine();
            }
            if (wints > loses) {
                moneyForTheDay *= 1.1;
                daysWin++;
            } else {
                daysLose++;
            }
            totalMoneyEarnest += moneyForTheDay;
        }
        if (daysWin > daysLose) {
            totalMoneyEarnest *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoneyEarnest);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoneyEarnest);
        }
    }
}
