import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double percentTwoCount = 0;
        double percentThreeCount = 0;
        double percentFourCount = 0;


        for (int i = 1; i <= number; i++) {
            int valid = Integer.parseInt(scanner.nextLine());

            if (valid % 2 == 0) {
                percentTwoCount++;
            }
            if (valid % 3 == 0) {
                percentThreeCount++;
            }
            if (valid % 4 == 0) {
                percentFourCount++;
            }
        }
                    double p1 = (percentTwoCount / number) * 100;
                    double p2 = (percentThreeCount / number) * 100;
                    double p3 = (percentFourCount / number) * 100;


                    System.out.printf("%n%.2f%%", p1);
                    System.out.printf("%n%.2f%%", p2);
                    System.out.printf("%n%.2f%%", p3);
                }
            }















