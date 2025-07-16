import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        flloat pi = 3.14;
        do{
            System.out.printf("nhap vao ban kinh r: ");
            float r = sc.nextFloat();
        }while( r>0 && r<1000);

        System.out.printf(%.3(2*pi*r)+" "+%.3(pi*r*r));
    }
}