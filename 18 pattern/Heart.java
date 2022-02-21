import java.util.Scanner;

public class Heart {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Enter n : \n");
            n = sc.nextInt();

            int d = (n + 1) / 2;
            int c = d + (d - 1);

            for (int row = 1; row <= d; row++) {
                for (int col = 1; col <= d - row; col++) {
                    System.out.print("  ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                if (row >= 2) {
                    for (int col = 1; col <= row - 1; col++) {
                        System.out.print("* ");
                    }
                }
                for (int col = 1; col <= d - row; col++) {
                    System.out.print("  ");
                }
                // System.out.println();
                for (int col = 1; col <= d - row - 1; col++) {
                    System.out.print("  ");
                }
                if (row != d) {
                    for (int col = 1; col <= row; col++) {
                        System.out.print("* ");
                    }
                }
                if (row == d) {
                    for (int col = 1; col <= d - 1; col++) {
                        System.out.print("* ");
                    }
                }
                if (row >= 2) {
                    for (int col = 1; col <= row - 1; col++) {
                        System.out.print("* ");
                    }
                }
                for (int col = 1; col <= d - row; col++) {
                    System.out.print("  ");
                }
                System.out.println();
            }

            for (int row = 1; row <= c - 1; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("  ");
                }
                for (int col = 1; col <= c - row; col++) {
                    System.out.print("* ");
                }
                for (int col = 1; col <= c - row - 1; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
