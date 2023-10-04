public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(5);
        System.out.println("Luas Lingkaran: " + lingkaran.luas(0));
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling(0));
        System.out.println();

        PersegiPanjang persegiPanjang = new PersegiPanjang(6, 4);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas(0));
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling(0));
        System.out.println();

        Segitiga segitiga = new Segitiga(3, 4);
        System.out.println("Luas Segitiga: " + segitiga.luas(0));
        System.out.println("Keliling Segitiga: " + segitiga.keliling(0));
    }
}
