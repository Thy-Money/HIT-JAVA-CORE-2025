import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Tuoi: ");
        int tuoi = sc.nextInt();

        System.out.print("Chieu cao: ");
        float chieucao = sc.nextFloat();

        System.out.print("Xin chao "+name+", bạn "+tuoi+" tuổi và cao "+chieucao+" mét" );
        
    }
}
