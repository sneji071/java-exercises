import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        int counter = 0;
        String input = scanner.nextLine();
        boolean isFound = false;

        while (!input.equals("No More Books")) {
            if (bookName.equals(input)) {
                System.out.printf("You checked %d books and found it.", counter);
                isFound = true;
                break;
            }
            counter ++;
            input = scanner.nextLine();
        }
        if (!isFound) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", counter);


        }

    }

}








