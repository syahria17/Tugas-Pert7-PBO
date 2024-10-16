package LatihanNo1;

public class OddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Bilangan ganjil: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan genap: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}