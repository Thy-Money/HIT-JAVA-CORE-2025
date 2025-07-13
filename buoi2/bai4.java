import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        int max = a[0];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            sum += a[i];
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.print("Các số đã nhập: ");
        for (int i=0; i<5 ;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nTổng các phần tử: " + sum);
        System.out.println("Giá trị lớn nhất: " + max);
    }
}