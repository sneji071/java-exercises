import java.util.Scanner;

public class FuelTankOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String typeFuel = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());

        switch (typeFuel) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (liters >= 25) {
                    System.out.printf("You have enough %s.", typeFuel.toLowerCase());
                } else {

                    System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
                    break;
                }
        }
                if (!"Diesel".equals(typeFuel)) {
                    if (!"Gasoline".equals(typeFuel)) {
                        if (!"Gas".equals(typeFuel)) {
                            System.out.println("Invalid fuel!");

                        }
                    }

                }

        }
    }


















