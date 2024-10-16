package LatihanNo1;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Bilangan prima: ");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBukan bilangan prima: ");
        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}