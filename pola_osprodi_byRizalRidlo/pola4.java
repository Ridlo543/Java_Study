import java.util.Scanner;
public class pola4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count % 2 == 0) {
            count--;
        }

        int center = (count - 1) / 2;

        // top
        for (int a = 0; a < center; a++) {
            if (a == 0) {
                for (int b = 0; b < count; b++) {
                    System.out.print("* ");
                }
            } else {
                for (int b = center; b > a - 1; b--) {
                    System.out.print("* ");
                }
                for (int b = 0; b < 2 * a - 1; b++) {
                    System.out.print("  ");
                }
                for (int b = center; b > a - 1; b--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // center
        for (int a = 0; a < count; a++) {
            if (a == 0 || a == (count - 1)) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();

        // bottom
        for (int a = 0; a < center; a++) {
            if (a == center - 1) {
                for (int b = 0; b < count; b++) {
                    System.out.print("* ");
                }
            } else {
                for (int b = 0; b < a + 2; b++) {
                    System.out.print("* ");
                }
                for (int b = 0; b < (count - 4) - (2 * a); b++) {
                    System.out.print("  ");
                }
                for (int b = 0; b < a + 2; b++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}