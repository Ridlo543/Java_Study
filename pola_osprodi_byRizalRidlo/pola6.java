import java.util.Scanner;
public class pola6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            n--;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i+j == n+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}