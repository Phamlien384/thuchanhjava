import java.util.Scanner;
public class AppBai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + thuong);  
        int phanDu = a % b;
        System.out.println(a + " % " + b + " = " + phanDu);
        System.out.println("Ket qua so sanh bang 2 so " + a + " va " +  b + " la " + (a == b));
        System.out.println("Ket qua so sanh lon hon 2 so " + a + " va " +  b + " la " + (a > b));
        System.out.println("Ket qua so sanh nho hon 2 so " + a + " va " +  b + " la " + (a < b));
        sc.close();
    }
}