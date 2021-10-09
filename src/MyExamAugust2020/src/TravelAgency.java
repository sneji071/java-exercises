import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numbereTickets = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        int priceOneTicket = Integer.parseInt(scanner.nextLine());

        double sum = priceOneTicket * numbereTickets;
        if (sum <= budget) {
            System.out.printf("%nYou can sell your client %d tickets for the price of %.0f$!", numbereTickets, sum);
            System.out.printf("%nYour client should become a change of %.0f$!", budget - sum);
        } else if (sum > budget) {
            System.out.printf("The budget of %d$ is not enough. Your client can't buy %d tickets with this budget!",
                    budget, numbereTickets);
        }


    }
}

