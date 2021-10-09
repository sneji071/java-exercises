import java.util.Scanner;

public class FuelT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());


        if (type.equals("Diesel") || type.equals("Gasoline") || type.equals("Gas")) {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", type.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", type.toLowerCase());
            }

        }
             else {
                System.out.println("Invalid fuel!");

            }

        }

    }













