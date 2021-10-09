import java.util.Scanner;

public class NameGame {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int bestPoint = 0;
        String winter = "";

        while (!name.equals("Stop")) {
            int currentPoint = 0;
            for (int i = 0; i < name.length(); i++) {

                int number = Integer.parseInt(scanner.nextLine());
                if (number == name.charAt(i)) {
                    currentPoint += 10;
                } else {
                    currentPoint += 2;

                }
            }
            if (currentPoint >= bestPoint) {
                bestPoint = currentPoint;
                winter = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winter, bestPoint);


    }
}