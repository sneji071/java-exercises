import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGroups = Integer.parseInt(scanner.nextLine());


        int counMusala = 0;
        int countMontBlanc = 0;
        int countKilimanjaro = 0;
        int countKaTwo = 0;
        int countEverest = 0;
        int countPeople = 0;

        for (int i = 1; i <= numberGroups; i++) {
            int peopleInGurrentGrup = Integer.parseInt(scanner.nextLine());
            countPeople += peopleInGurrentGrup;
            if (peopleInGurrentGrup <= 5) {
                counMusala += peopleInGurrentGrup;
            } else if (peopleInGurrentGrup <= 12) {
                countMontBlanc += peopleInGurrentGrup;
            } else if (peopleInGurrentGrup <= 25) {
                countKilimanjaro += peopleInGurrentGrup;
            } else if (peopleInGurrentGrup <= 40) {
                countKaTwo += peopleInGurrentGrup;
            } else {
                countEverest += peopleInGurrentGrup;

            }

        }
        double percentMusala = counMusala * 1.0/ countPeople * 100;
        double percentMontBlanc = countMontBlanc * 1.0 / countPeople * 100;
        double percentKilimanjaro = countKilimanjaro * 1.0 / countPeople * 100;
        double percentKaTwo = countKaTwo * 1.0 / countPeople * 100;
        double percentEverest = countEverest * 1.0 / countPeople * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMontBlanc);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentKaTwo);
        System.out.printf("%.2f%%%n", percentEverest);
    }

}




