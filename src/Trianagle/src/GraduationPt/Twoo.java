package GraduationPt;

import java.util.Scanner;

public class Twoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sum = 0;
        int counter = 1;
        int excluded = 0;

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                excluded++;
                if (excluded > 1) {
                    System.out.printf("%s has been excluded at %d grade%n", name, counter);
                    return;
                }
                continue;
            }
            sum += grade;
            counter++;
        }
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);

        }
    }

