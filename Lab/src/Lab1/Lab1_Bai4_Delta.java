package Lab1;

import java.util.Scanner;

public class Lab1_Bai4_Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập các hệ số của phương trình bậc 2
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // Tính căn delta (nếu delta >= 0)
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.printf("Delta: %.2f\n", delta);
            System.out.printf("Căn Delta: %.2f\n", canDelta);
        } else {
            System.out.printf("Delta: %.2f\n", delta);
            System.out.println("Delta âm, không có căn bậc hai thực.");
        }
        
        // Đóng scanner
        scanner.close();
    }
}
