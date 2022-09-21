import java.util.Scanner;

public class pola3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count % 2 == 0) {
            count--;
        }
        int center = (count - 1) / 2;

        // top
        for (int a = 0; a < center; a++) {
            for (int b = center; b > a; b--) {
                System.out.print("  ");
            }
            for (int b = 0; b < (2 * a) + 1; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // center
        for (int a = 0; a < count; a++) {
            System.out.print("* ");
        }
        System.out.println();

        // bottom
        for (int a = 0; a < center; a++) {
            for (int b = 0; b < a + 1; b++) {
                System.out.print("  ");
            }
            for (int b = 0; b < count - (2 * (a + 1)); b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}