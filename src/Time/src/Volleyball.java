import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidaysInYear = Integer.parseInt(scanner.nextLine());
        int travelsWeekend = Integer.parseInt(scanner.nextLine());

        double weekendSofia = 48 - travelsWeekend ;
        double gamesInSofia = weekendSofia * 3.0 / 4;
        double gamesRural = holidaysInYear * 2.0 /3;
        double totalGames = (travelsWeekend + gamesInSofia + gamesRural );

        switch(year) {
            case "leap":

                System.out.printf("%.0f", Math.floor(totalGames * 1.15));
                break;
            case "normal":
                System.out.printf("%.0f", Math.floor(totalGames));
                break;


        }

   }

}
