
import java.util.Scanner;
public class AreaofFigures {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;

        if (figure.equals("square")) {
            double sideS = Double.parseDouble(scanner.nextLine());
            area = sideS * sideS;
        } else if (figure.equals("rectangle")) {
            double sideRa = Double.parseDouble(scanner.nextLine());
            double sideRb = Double.parseDouble(scanner.nextLine());
            area = sideRa * sideRb;
        } else if (figure.equals("circle")) {
            double radiusC = Double.parseDouble(scanner.nextLine());
            area = Math.PI * (radiusC * radiusC);
        } else if (figure.equals("triangle")) {
            double sideT = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (sideT * height) / 2;
        }
            System.out.printf("%.3f", area);
        }
    }




