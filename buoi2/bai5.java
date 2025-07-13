public class bai5 {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương số 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        int t = 0;
        for (int i = 2; i <= 100; i += 2) {
            t += i;
        }
        System.out.println("Tổng số chẵn từ 1 đến 100 (for): " + t);

        int s = 0;
        int i = 2;
        while (i <= 100) {
            s += i;
            i += 2;
        }
        System.out.println("Tổng số chẵn từ 1 đến 100 (while): " + s);
    }
}