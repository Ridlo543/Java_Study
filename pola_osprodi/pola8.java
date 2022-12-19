import java.util.Scanner;
public class pola8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count % 2 == 0) {
            count--;
        }
        int center = (count - 1) / 2;

        // top
        for (int a = 0; a < center; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("  ");
            }
            for (int b = count - (2 * a); b > 0; b--) {
                System.out.print("* ");
            }
            System.out.println();
        }
            // center
        for (int a = 0; a < count; a++) {
            if (a == center) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();

        // bottom
        for (int a = 0; a < center; a++) {
            for (int b = center - a - 1; b > 0; b--) {
                System.out.print("  ");
            }
            for (int b = 0; b < (2 * a) + 3; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}