import java.util.Scanner;
public class AppBai10 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 chuoi bat ky: ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);

        System.out.println("Nhap vao ky tu can đem so lan xuat hien: ");
        kyTu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        } 
        System.out.println("So lan xuat hien cua ky tu " + kyTu + " trong chuoi " + chuoi + " = " + count);
        sc.close();
    }
}
