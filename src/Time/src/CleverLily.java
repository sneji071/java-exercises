

import javax.swing.*;
import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double washPrice = Double.parseDouble(scanner.nextLine());
        int oneToyPrice = Integer.parseInt(scanner.nextLine());

        double moneySum = 0;
        double brother = 0;
        double toysSum = 0;
        double totalSum = 0;


        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                moneySum += i * 5;
                brother += 1;
            }else if (i % 2 != 0) {
                toysSum += oneToyPrice;
            }   totalSum = moneySum - brother + toysSum;


        }
        if (totalSum >= washPrice) {
            System.out.printf("Yes! %.2f ", totalSum - washPrice);


        } else {
            System.out.printf("No! %.2f", washPrice - totalSum);

        }
    }

}

