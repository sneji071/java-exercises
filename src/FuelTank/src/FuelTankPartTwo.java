import java.util.Scanner;

public class FuelTankPartTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String kard = scanner.nextLine();

        double totalSum = 0;


        if (kard.equals("Yes")) {
            switch (type) {
                case "Gas":
                    if (20 <= liters && liters <= 25)
                        totalSum = (0.93 - 0.08) * liters * 0.92;
                    if (liters > 25)
                        totalSum = (0.93 - 0.08) * liters * 0.90;
                    if (liters < 20)
                        totalSum = (0.93 - 0.08) * liters;
                    break;
                case "Gasoline":
                    if (20 <= liters && liters <= 25)
                        totalSum = (2.22 - 0.18) * liters * 0.92;
                    if (liters > 25)
                        totalSum = (2.22 - 0.18) * liters * 0.90;
                    if (liters < 20)
                        totalSum = (2.22 - 0.18) * liters;
                    break;
                case "Diesel":
                    if (20 <= liters && liters <= 25)
                        totalSum = (2.33 - 0.12) * liters * 0.92;
                    if (liters > 25)
                        totalSum = (2.33 - 0.12) * liters * 0.90;
                    if (liters < 20)
                        totalSum = (2.33 - 0.12) * liters;
                    break;
            }
            System.out.printf("%.2f lv.", totalSum);


        } else if (kard.equals("No")) {
            switch (type) {
                case "Gas":
                    if (20 <= liters && liters <= 25)
                        totalSum = 0.93 * liters * 0.92;
                    if (liters > 25)
                        totalSum = 0.93 * liters * 0.90;
                    if (liters < 20)
                        totalSum = 0.93 * liters;
                    break;
                case "Gasoline":
                    if (20 <= liters && liters <= 25)
                        totalSum = 2.22 * liters * 0.92;
                    if (liters > 25)
                        totalSum = 2.22 * liters * 0.90;
                    if (liters < 20)
                        totalSum = 2.22 * liters;
                    break;
                case "Diesel":
                    if (20 <= liters && liters <= 25)
                        totalSum = 2.33 * liters * 0.92;
                    if (liters > 25)
                        totalSum = 2.33 * liters * 0.90;
                    if (liters < 20)
                        totalSum = 2.33 * liters;
                    break;
            }
            System.out.printf("%.2f lv.", totalSum);


        }
    }

}















