package LatihanNo1;

public class LaguAnakAyam {
    public static void main(String[] args) {
        int n = 10;  // Misalnya N adalah 10
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun 1, mati 1 tinggal induknya");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati 1 tinggal " + (i - 1));
            }
        }
    }
}