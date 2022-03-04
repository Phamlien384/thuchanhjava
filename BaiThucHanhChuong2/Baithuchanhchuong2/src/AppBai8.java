import java.text.DecimalFormat;
import java.util.Scanner;

public class AppBai8 {

    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);

        // lam tron đen 2 chu so thap phan
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    

        System.out.println("Nhap vao so cac so nguyen co trong day: ");
        n = scanner.nextInt();

        /*
         * bat dau duyet tu bien đem count = 1 
         * neu count con <= n thi nhap vao so number thu count
         * sau do cong gia tri cua bien number vao bien sum
         * vong lap dung khi bien đem count > n.
         */
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhap so thu " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }

        avgNumber = (float) sum / n;
        System.out.println("Trung binh cong = " + decimalFormat.format(avgNumber));
        scanner.close();
    }

}
