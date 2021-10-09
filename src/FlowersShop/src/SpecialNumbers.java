import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int m = 1; m <= 9; m++) {
                        boolean first = number % i == 0;
                        boolean second = number % j == 0;
                        boolean third = number % k == 0;
                        boolean four = number % m == 0;
                        if (first && second && third && four) {

                            System.out.printf("%d%d%d%d ", i, j, k, m);


                        }
                    }
                }
            }

        }

    }

}








