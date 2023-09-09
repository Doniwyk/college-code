package Task2;

public class Main {
    public static void main(String[] args) {
        Peminjaman peminjaman1 = new Peminjaman(101, "Daffa Maulana", "GTA V", 5, 50.0f);
        Peminjaman peminjaman2 = new Peminjaman(102, "Yudisa Daffa", "RDR 2", 6, 60.0f);

        peminjaman1.tampilkanDataPeminjaman();
        peminjaman2.tampilkanDataPeminjaman();
    }
}
