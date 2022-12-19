import java.util.Scanner;
public class pola7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count % 2 == 0) {
            count--;
        }

        int centerIndex = (count - 1) / 2;

        for (int a = 0; a < centerIndex; a++) {
            if (a == 0) {
                System.out.print("* ");
                for (int b = 0; b < count - 2; b++)
                    System.out.print("  ");
                System.out.print("*");
            } else {
                for (int b = 0; b < a + 1; b++)
                    System.out.print("* ");
                for (int b = (((centerIndex - 1) - a) * 4) + 1; b > 0 ; b--)
                    System.out.print(" ");
                for (int b = 0; b < a + 1; b++)
                    System.out.print(" *");
            }
            System.out.println();
        }

        for (int a = 0; a < count; a++)
            System.out.print("* ");
        System.out.println();

        for (int a = 0; a < centerIndex; a++) {
            if (a == centerIndex - 1) {
                System.out.print("* ");
                for (int b = 0; b < count - 2; b++)
                    System.out.print("  ");
                System.out.print("*");
            } else {
                for (int b = (count - 1) / 2; b > a; b--) {
                    System.out.print("* ");
                }
                for (int b = 0; b < 4 * a + 1; b++) {
                    System.out.print(" ");
                }
                for (int b = (count - 1) / 2; b > a; b--) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}