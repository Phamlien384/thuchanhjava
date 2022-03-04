import java.util.Scanner;

public class AppBai3 {

    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap vao nam sinh: ");
        year = scanner.nextInt();

        // Xac đinh đo tuoi tuong ung
        age = 2017 - year;  // 2017 la nam hien tai
        if (age < 16) {
            ageGroup = "tuoi vi thanh nien.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuoi truong thanh.";
        } else {
            ageGroup = "gia roi!";
        }

        System.out.println("Ban " + name + " thuoc nhom " + ageGroup);
        scanner.close();
    }

}
