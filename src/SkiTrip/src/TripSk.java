import javax.swing.*;
import java.util.Scanner;

public class TripSk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String raiting = scanner.nextLine();

        double price = 0;
        int night = day - 1;
        if("room for one person".equals(room)) {
            price = night * 18;
        } else if ("apartment".equals(room)){
            if(night < 10) {
                price= night * 25 * 0.7;

            }
            if (night>= 10  && day <= 15) {
                price = night * 25 * 0.65;
            }
            if (night > 15) {
                price = night * 25 * 0.5;
            }
        } else if ("president apartment".equals(room)) {
            if (night <10) {
                price = night * 35 * 0.9;

            }
            if (night >=10 && day <= 15) {
                price = night * 35 * 0.85;
            }
            if (night >15)
                price = night * 35 * 0.8;
        }

     if("positive".equals(raiting)) {
         System.out.printf("%.2f", price * 1.25);
     } else if ("negative".equals(raiting)){
         System.out.printf("%.2f", price * 0.9);
     }

     }

}

