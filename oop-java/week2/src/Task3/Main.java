package Task3;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 8;
        System.out.println("Jari-jari\t: " + lingkaran.r);
        System.out.println("Luas\t\t: " + lingkaran.hitungLuas());
        System.out.println("Keliling\t: " + lingkaran.hitungKeliling());
    }
}
