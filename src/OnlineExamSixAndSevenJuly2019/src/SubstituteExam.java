import java.util.Scanner;

public class SubstituteExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberK = Integer.parseInt(scanner.nextLine());
        int numberL = Integer.parseInt(scanner.nextLine());
        int numberM = Integer.parseInt(scanner.nextLine());
        int numberN = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 0;
        int counter = 0;
        boolean isCounted = false;


        for (int i = numberK; i <= 8; i++) {
            for (int j = 9; j <= numberL; j--) {
                for (int k = numberM; k <= 8; k++) {
                    for (int l = 9; l <= numberN; l++) {
                        String number1 = "" + i + j;
                        first = Integer.parseInt(number1);
                        String number2 = "" + k + l;
                        second = Integer.parseInt(number2);

                        boolean isValid = i % 2 == 0 && j % 2 != 0 && k % 2 == 0 && l % 2 != 0;
                        if (isValid && first == second) {
                            System.out.println("Cannot change the same player.");
                        } else if (isValid && first != second) {
                            System.out.printf("%d%d - %d%d%n", i, j, k, l);
                            counter++;
                        }
                        if (counter == 6) {
                            isCounted = true;
                            break;

                        }
                    }
                    if (isCounted) {
                        break;
                    }
                }
                if (isCounted) {
                    break;
                }
            }
            if (isCounted) {
                break;
            }
        }
    }
}






