import java.util.Scanner;

public class ShopingForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int colourPencils = Integer.parseInt(scanner.nextLine());
        int colosFulmasters = Integer.parseInt(scanner.nextLine());
        int drawingSketches = Integer.parseInt(scanner.nextLine());
        int notebooks = Integer.parseInt(scanner.nextLine());

        double sumPencils = colourPencils * 4.75;
        double sumFulmasters = colosFulmasters * 1.80;
        double sumSketches = drawingSketches * 6.50;
        double sumNotebooks = notebooks * 2.50;

        double totalSum = sumPencils + sumFulmasters + sumSketches + sumNotebooks;
        double percentFive = 0.05 * totalSum;

        double resultSum = totalSum - percentFive;

        System.out.printf("Your total is %.2flv", resultSum);


    }
}

