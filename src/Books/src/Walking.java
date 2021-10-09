import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSteps = 0;
        int targetStep = 10000;

        while (sumSteps < targetStep) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                int curentSteps = Integer.parseInt(scanner.nextLine());
                sumSteps += curentSteps;
                break;
            }
            sumSteps += Integer.parseInt(input);

        }
        if (sumSteps >= targetStep) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(sumSteps - targetStep));
        } else {
            System.out.printf("%d more steps to reach goal.",Math.abs(sumSteps - targetStep));
        }

    }
}