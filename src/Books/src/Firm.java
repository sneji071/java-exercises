import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numberWolkersOver = Integer.parseInt(scanner.nextLine());


        double proektTime = Math.floor(days * 8 * 0.9);
        double numberWolkersOverTime = Math.floor(days * 2 * numberWolkersOver);
        double totalTime = proektTime + numberWolkersOverTime ;


        if (totalTime >= hours) {
            double left = totalTime - hours;
            System.out.printf("Yes!%.0f hours left.", Math.floor(left));

        } else {
            double needed = hours - totalTime;
            System.out.printf("Not enough time!%.0f hours needed.", Math.floor(needed));
        }


    }
}
