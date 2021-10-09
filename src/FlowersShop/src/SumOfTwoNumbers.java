import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean magicNomberFound = false;
        String output = "";

        for (int i = start; i <= end; i++) {

            for (int j = start; j <= end; j++) {
                counter++;
                if ((i + j) == magicNumber) {
                    output = String.format("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    magicNomberFound = true;
                    break;

                }
            }
            if (magicNomberFound) {
                break;
            }
        }
        if (magicNomberFound) {
            System.out.println(output);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}