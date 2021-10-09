import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celius = Double.parseDouble(scanner.nextLine());

        double fahrenheim = celius * 1.8 + 32;

        System.out.printf("%.2f", fahrenheim);
    }
}
 ///°F = °C × 1,8 + 32