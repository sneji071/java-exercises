import java.util.Scanner;

public class IIIidanExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int forceOneMan = Integer.parseInt(scanner.nextLine());
        int bloodIllidan = Integer.parseInt(scanner.nextLine());

        int bloodGroup = people * forceOneMan;
        if(bloodGroup < bloodIllidan ){
            System.out.printf("You are not prepared! You need %d more points.",
                    bloodIllidan -
                    bloodGroup);
        } else {
            System.out.printf("Illidan has been slain! You defeated him with %d points.",  bloodGroup -bloodIllidan);
        }

    }
}
