import java.util.Scanner;

public class TraeinTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());


        double sumAllGrades = 0;
        int countPresentation = 0;
        String presentation = scanner.nextLine();

        while (!presentation.equals("Finish")) {
            double sumCurentGrades = 0;
            countPresentation++;
            for (int i = 0; i < peopleCount; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumCurentGrades += currentGrade;
            }
            double averageGrade = sumCurentGrades / peopleCount;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);

            sumAllGrades += averageGrade;
            presentation = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.", sumAllGrades/countPresentation);
    }
}