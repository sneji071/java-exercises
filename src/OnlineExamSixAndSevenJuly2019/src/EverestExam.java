import java.util.Scanner;

public class EverestExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int start = 5364;
        int finish = 8848;
        int day = 1;

        while (!command.equals("END")) {
            int meters = Integer.parseInt(scanner.nextLine());
            if (command.equals("Yes")) {
                day++;
                start += meters;
            } else if (command.equals("No")) {
                start += meters;
            }
            if (start >= finish) {
                System.out.printf("Goal reached for %d days!", day);
                return;
            }
            command = scanner.nextLine();
            if (day == 5) {
                System.out.printf("Failed! %n%d", start);
                return;
            }
        }
        System.out.printf("Failed! %n%d", start);

    }
}

























