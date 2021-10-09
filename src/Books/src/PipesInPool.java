import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volume = Double.parseDouble(scanner.nextLine());
        int flowP1 = Integer.parseInt(scanner.nextLine());
        int flowP2 = Integer.parseInt(scanner.nextLine());
        double hour = Double.parseDouble(scanner.nextLine());


        double momentvolumeP1 = flowP1 * hour;
        double momentvolumeP2 = flowP2 * hour;
        double momnetVolume = momentvolumeP1 + momentvolumeP2;

        double percentVolume = momnetVolume / volume * 100;
        double percentP1 = momentvolumeP1 / momnetVolume * 100;
        double percentP2 = momentvolumeP2 / momnetVolume * 100;

        if (volume >= momnetVolume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    percentVolume, percentP1, percentP2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hour, Math.abs(volume - momnetVolume));
        }


    }
}
