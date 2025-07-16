import java.util.Scanner;

    public class bai1 {
        public static int tinhtong(int c, int d){
            int t;
            t=c*d;
            return t;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
//            System.out.print("Nhap ten cua ban: ");
//            String name = sc.nextLine();
//
//            System.out.print("Nhap vao so nguyen: ");
//            int number1 = sc.nextInt();
//
//            System.out.print("Nhap vao so thuc: ");
//            double number2 = sc.nextDouble();
//            boolean a ;
//            System.out.println("Xin chao "+ name);
//
//            System.out.println("nhap day: ");
//            int day = sc.nextInt();
//            switch (day) {
//                case 2:
//                    System.out.println("Thứ Hai");
//                    break;
//                case 3:
//                    System.out.println("Thứ Ba");
//                    break;
//                case 4:
//                    System.out.println("Thứ Tư");
//                    break;
//                case 5:
//                    System.out.println("Thứ Nam");
//                    break;
//                case 6:
//                    System.out.println("Thứ Sau");
//                    break;
//                case 7:
//                    System.out.println("Thứ Bay");
//                    break;
//                case 8:
//                    System.out.println("Chu nhat");
//                    break;
//                default:
//                    System.out.println("Không hợp lệ");
//            }
//
//            int[] b= new int[100];
//            int n=sc.nextInt();
////            String[] ten = "ngongoc";
////            for (int i=0 ;i<n ;i++)
////                b[i]=sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(tinhtong(c,d));
        }

}
