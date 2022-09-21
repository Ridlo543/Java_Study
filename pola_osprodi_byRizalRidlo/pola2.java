import java.util.Scanner;

public class pola2
{
    public static void main(String[] args)
    {
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
                for (int b = 0; b < count; b++) {
                    if (b == 0 || b == center || b == (count - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");;
                    }
                }
            }
            System.out.println();
        }

        // center
        for (int a = 0; a < count; a++) {
            System.out.print("  ");
        }
        System.out.println();

        // bottom
        for (int a = 0; a < center; a++) {
            if (a == (center - 1)) {
                for (int b = 0; b < count; b++) {
                    System.out.print("  ");
                }
            } else {
                for (int b = 0; b < count; b++) {
                    if (b == 0 || b == center || b == (count - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        // bottom
        for (int a = 0; a < center; a++) {
            if (a == (center - 1)) {
                for (int b = 0; b < count; b++) {
                    System.out.print("* ");
                }
            } else {
                for (int b = 0; b < count; b++) {
                    if (b == 0 || b == center || b == (count - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}