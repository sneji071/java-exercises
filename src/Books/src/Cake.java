import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widht = Integer.parseInt(scanner.nextLine());
        int leight = Integer.parseInt(scanner.nextLine());

        int cakePieces = widht * leight;
        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            int currentCakePieces = Integer.parseInt(input);
            cakePieces -= currentCakePieces;
            if (cakePieces < 0) {
                break;
            }


            input = scanner.nextLine();

        }

        if (cakePieces < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        } else {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
