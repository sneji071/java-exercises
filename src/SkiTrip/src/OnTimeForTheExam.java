import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMins = Integer.parseInt(scanner.nextLine());

        int totalMints = hour * 60 + minutes;
        int totalArrivalMints = arrivalHour * 60 + arrivalMins;

        int min = 0;
        int h = 0;

        if (totalMints == totalArrivalMints) {
            System.out.println("On time");
        } else if (totalMints > totalArrivalMints) {
            min = totalMints - totalArrivalMints;
            if (min <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", min);
            } else if (totalMints - totalArrivalMints < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", min);
            } else {
                System.out.println("Early");
                h = min / 60;
                min %= 60;
                System.out.printf("%d:%02d hours before the start", h, min);
            }


        } else {
            System.out.println("Late");
            min = totalArrivalMints - totalMints;
            if (min < 60) {
                System.out.printf("%d minutes after the start", min);
            } else {
                h = min / 60;
                min %= 60;
                System.out.printf("%d:%02d minutes after the start", h, min);
            }

        }


    }

}