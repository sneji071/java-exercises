import java.util.Scanner;

public class RateExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int monts = Integer.parseInt(scanner.nextLine());


        double totalSumSimpleInterest = sum;
        double totalSumCompoidinterst = sum;

        for (int i = 0; i < monts; i++) {
            totalSumSimpleInterest += 0.03 * sum;
        }
        for (int j = 0; j < monts; j++) {
            double lasstMont = totalSumCompoidinterst;
            totalSumCompoidinterst = lasstMont + 0.027 * lasstMont;

        }
        System.out.printf("Simple interest rate: %.2f lv.%nComplex interest rate: %.2f lv.",
                totalSumSimpleInterest, totalSumCompoidinterst );

        if (totalSumCompoidinterst > totalSumSimpleInterest) {
            System.out.printf("%nChoose a complex interest rate. You will win %.2f lv.",
                    (totalSumCompoidinterst - totalSumSimpleInterest));

        } else if (totalSumSimpleInterest > totalSumCompoidinterst) {
            System.out.printf("%nChoose a simple interest rate. You will win %.2f lv.",
                    (totalSumSimpleInterest - totalSumCompoidinterst));

        }

    }

}