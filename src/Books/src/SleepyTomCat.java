import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        int holidaysGame = holidays * 127;
        int workGames = (365 - holidays) * 63;

        int sumTimeGames = holidaysGame + workGames;
         int hour = Math.abs(sumTimeGames - 30000) / 60;
         int minute = Math.abs(sumTimeGames - 30000) % 60;


        if (sumTimeGames >= 30000) {
            System.out.println("Tom will run away");
           System.out.printf("%s hours and %s minutes more for play", hour, minute);

        }else{

            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes less for play", hour, minute);



        }


    }

}

