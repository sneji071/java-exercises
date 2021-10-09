import java.util.Scanner;

    public class EasterEggs {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numberEggs = Integer.parseInt(scanner.nextLine());

            int numbersRed = 0;
            int numbersOrange = 0;
            int numbersBlue = 0;
            int numbersGreen = 0;

            int maxNumber = Integer.MIN_VALUE;
            String maxEggs = "";

            for (int i = 1; i <= numberEggs; i++) {
                String color = scanner.nextLine();
                switch (color) {
                    case "red":
                        numbersRed++;
                        break;
                    case "orange":
                        numbersOrange++;
                        break;
                    case "blue":
                        numbersBlue++;
                        break;
                    case "green":
                        numbersGreen++;
                        break;
                }
            }
            if (numbersRed >= maxNumber) {
                maxNumber = numbersRed;
                maxEggs = "red";
            }
            if (numbersOrange >= maxNumber) {
                maxNumber = numbersOrange;
                maxEggs = "orange";
            }
            if (numbersBlue >= maxNumber) {
                maxNumber = numbersBlue;
                maxEggs = "blue";
            }
            if (numbersGreen >= maxNumber) {
                maxNumber = numbersGreen;
                maxEggs = "green";
            }
            System.out.printf("%nRed eggs: %d", numbersRed);
            System.out.printf("%nOrange eggs: %d", numbersOrange);
            System.out.printf("%nBlue eggs: %d", numbersBlue);
            System.out.printf("%nGreen eggs: %d", numbersGreen);
            System.out.printf("%nMax eggs: %d -> %s", maxNumber, maxEggs);


        }
    }