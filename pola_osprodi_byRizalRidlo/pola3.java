import java.util.*;
import java.util.Scanner;

public class pola3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int space = n - 3;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }


    }
}