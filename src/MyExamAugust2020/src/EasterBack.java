import java.util.Scanner;

public class EasterBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberEasterCakes = Integer.parseInt(scanner.nextLine());

        int sugar = 0;
        int flour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i=1; i<=numberEasterCakes; i++) {
            int sugarOneEasterCakes = Integer.parseInt(scanner.nextLine());
            int flourOneEasterCakes = Integer.parseInt(scanner.nextLine());
            sugar += sugarOneEasterCakes;
            flour += flourOneEasterCakes;
            if (sugarOneEasterCakes > maxSugar) {
                maxSugar = sugarOneEasterCakes;
            }
            if (flourOneEasterCakes > maxFlour) {
                maxFlour = flourOneEasterCakes;
            }
        }
        System.out.printf("%nSugar: %.0f", Math.ceil(sugar/950.0));
        System.out.printf("%nFlour: %.0f", Math.ceil(flour/750.0));
        System.out.printf("%nMax used flour is %d grams, max used sugar is %d grams.", maxFlour,maxSugar);


    }
}





