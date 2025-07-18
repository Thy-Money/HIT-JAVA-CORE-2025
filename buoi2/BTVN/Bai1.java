package BTVN;

import java.util.Scanner;
import java.text.DecimalFormat;

import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        double r;
        do {
            System.out.print("nhap vao ban kinh r: ");
            r = sc.nextFloat();
        } while (r < 0 || r > 1000);
        double c=2*PI*r;
        double s=PI*r*r;

        DecimalFormat df = new DecimalFormat("#0.000");
        System.out.println(df.format(c)+ " " + df.format(s));
    }
}