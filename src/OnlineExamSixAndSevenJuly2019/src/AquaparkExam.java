import java.util.Scanner;

public class AquaparkExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mont = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int pepple = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double priceOneHour = 0;


        switch (mont) {
            case "march":
            case "april":
            case "may":
                if (time.equals("day")) {
                    priceOneHour = 10.50;
                } else if (time.equals("night")) {
                    priceOneHour = 8.40;
                }

                break;
            case "june":
            case "july":
            case "august":
                if (time.equals("day")) {
                    priceOneHour = 12.60;
                } else if (time.equals("night")) {
                    priceOneHour = 10.20;
                }
                break;


        }

        if (pepple >= 4)
            priceOneHour = priceOneHour * 0.90;

        if (hours >= 5)
            priceOneHour = priceOneHour * 0.50; {

        }
            System.out.printf("Price per person for one hour: %.2f", priceOneHour);
            System.out.printf("%nTotal cost of the visit: %.2f", priceOneHour * pepple * hours);

        }

        }






