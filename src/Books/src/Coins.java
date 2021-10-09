import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyInput = Double.parseDouble(scanner.nextLine());

          int  money = (int)(moneyInput *=100);
            int couinsCount = 0;

        while ( money > 0 ) {
            if ( money  >= 200 ) {
                money -= 200;
                couinsCount++;
            } else if ( money >= 100){
                money -=100;
                couinsCount ++;

            } else if ( money >= 50 ){
                money -=50;
                couinsCount ++;
            } else if ( money >= 20) {
                money -=20;
                couinsCount ++ ;
            } else if( money >= 10) {
                money -= 10;
                couinsCount ++;

            } else if (money >= 5) {
                money -= 5;
                couinsCount ++;

            } else if (money >=2){
                money -=2;
                couinsCount ++;

            } else if (money >=1) {
                money -= 1;
                couinsCount ++;
            }
        }
          System.out.println(couinsCount);
    }
}
