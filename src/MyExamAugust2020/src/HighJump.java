import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int likeHeight = Integer.parseInt(scanner.nextLine());

        int start = likeHeight-30;
        int jumps = 0;
        boolean yes = false;


        while (start <=likeHeight) {
            for (int j = 0; j < 3; j++) {
                int jumpCurrent = Integer.parseInt(scanner.nextLine());
                jumps++;
                if (jumpCurrent > start) {
                    start += 5;
                    break;
                }
                if (j == 2) {
                    System.out.printf("%nTihomir failed at %dcm after %d jumps.", start, jumps);
                    yes = true;
                }
            }
            if (yes) {
                break;
            }
        }
            if (!yes) {
                System.out.printf("%nTihomir succeeded, he jumped over %dcm " +
                        "after %d jumps.", likeHeight, jumps);
            }
        }
    }

