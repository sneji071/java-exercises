import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int eatenFood = 0;
        int gramFood = food * 1000;


        while (!input.equals("Adopted") ) {
            double foodOneDay = Double.parseDouble(input);
            eatenFood += foodOneDay;
            input = scanner.nextLine();
        }
        if (eatenFood <= gramFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", (gramFood - eatenFood));

        } else {
            System.out.printf("Food is not enough. You need %d grams more.",(eatenFood - gramFood));
        }
    }
}
