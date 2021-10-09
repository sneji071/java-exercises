import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
             int mumber = 1;

             while ( mumber <= n) {

                 System.out.println(mumber);

                 mumber = mumber * 2 + 1;
             }

    }
}
