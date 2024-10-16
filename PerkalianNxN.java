package LatihanNo2;

import java.util.Scanner;

public class PerkalianNxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();
        
        if (n > 10) {
            System.out.println("Nilai n tidak boleh lebih dari 10.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}