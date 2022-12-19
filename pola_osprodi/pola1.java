import java.util.Scanner;

public class pola1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        if (count % 2 == 0) {
            count--;
        }

        int center0 = (count - 1) / 2; // 3
        int center1 = (count + 1) / 2; // 4

        // top
        for (int a = 0; a < center0; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("  ");
            }
            for (int b = center1 - a; b > 0; b--) {
                System.out.print("*");
                System.out.print("   ");
            }
            System.out.println();
        }

        // center
        for (int a = 0; a < count; a++) {
            if (a == count - 1) {
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        // bottom
        for (int a = 0; a < center0; a++) {
            for (int b = center0 - a; b > 1; b--) {
                System.out.print("  ");
            }
            for (int b = 0; b < 2 + a; b++) {
                System.out.print("*");
                System.out.print("   ");
            }
            System.out.println();
        }
        scanner.close();
    }
}