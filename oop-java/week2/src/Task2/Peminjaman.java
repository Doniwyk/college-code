package Task2;

public class Peminjaman {
    private int id, lamaSewa;
    private String namaMember, namaGame;
    private float harga;

    public Peminjaman(int id, String namaMember, String namaGame, int lamaSewa, float harga) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.lamaSewa = lamaSewa;
        this.harga = harga;
    }

    public double hitungHarga() {
        return lamaSewa * harga;
    }

    public void tampilkanDataPeminjaman() {
        System.out.println("ID Peminjaman\t\t\t\t: " + id);
        System.out.println("Nama Member\t\t\t\t\t: " + namaMember);
        System.out.println("Nama Game\t\t\t\t\t: " + namaGame);
        System.out.println("Harga Sewa perhari\t\t\t: " + harga + " $");
        System.out.println("Lama Sewa\t\t\t\t\t: " + lamaSewa + " hari");
        System.out.println("Harga yang Harus Dibayar\t: " + hitungHarga() + " $");
        System.out.println("-----------------------------------------");
    }
}
