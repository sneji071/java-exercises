import javax.swing.*;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String inUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        if (inUnit.equals("mm")) {
            number = number / 1000;
        } else if (inUnit.equals("cm")) {
            number = number / 100;
        }
        if (outputUnit.equals("mm")) {
            number = number * 1000;
        } else if (outputUnit.equals("cm")) {
            number = number * 100;
        }
        System.out.printf("%.3f", number);
    }
}