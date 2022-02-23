import java.util.Scanner;
public class App1 {
   private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        int b = scanner.nextInt();
        scanner.close();
        while(a!=b)
        {
            if(a>b)
            {
                a = a-b;
            }
            else
            {
                b = b-a;
            }
        }
        System.out.println("USCLN cua 2 so vua nhap la:" +a);
    } 
    
 }    

