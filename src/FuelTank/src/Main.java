import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());

        if (typeFuel.equals("diesel") || typeFuel.equals("gasoline") || typeFuel.equals("gas"))
            if (liters >= 25) {
                System.out.printf("You have enough %s. ", typeFuel);
            }

    }

  }




