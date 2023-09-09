package Task4;

public class Main {
    public static void main(String[] args) {
        Barang barang = new Barang();

        barang.kode = "BRG001";
        barang.namaBarang = "Papan Tulis";
        barang.hargaDasar = 100000;
        barang.diskon = 10f;

        barang.tampilData();
    }
}
