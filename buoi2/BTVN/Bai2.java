package BTVN;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            b[i] = a[i];

            if (i % 2 != 0) {
                long L = 0;
                if (i > 0) {
                    L = a[i - 1];
                }

                long R = 0;
                if (i < n - 1) {
                    R = a[i + 1];
                }

                long difference = Math.abs(L -R);
                b[i] = a[i] + difference;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}