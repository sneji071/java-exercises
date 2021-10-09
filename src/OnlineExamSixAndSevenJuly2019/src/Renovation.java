import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 int height = Integer.parseInt(scanner.nextLine());
 int width = Integer.parseInt(scanner.nextLine());
 int percent = Integer.parseInt(scanner.nextLine());

 int meters = height * width * 4;
 double paint = Math.ceil(meters - meters * percent * 1.0/100);

 String input = scanner.nextLine();
 while (!input.equals("Tired!")){
     int liters = Integer.parseInt(input);
     paint -= liters;
     if (paint <= 0){
         break;
     }
     input = scanner.nextLine();
 }
if (paint == 0){
    System.out.println("All walls are painted! Great job, Pesho!");
} else  if (paint >0) {
    System.out.printf("%.0f quadratic m left. ", paint);
} else {
    System.out.printf("All walls are painted and you have %.0f l paint left!", paint*-1);
}

    }
}
