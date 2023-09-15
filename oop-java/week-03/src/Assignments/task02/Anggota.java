package Assignments.task02;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int pinjam) {
        if (pinjam > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += pinjam;
        }
    }

    public void angsur(int angsur) {
        jumlahPinjaman -= angsur;
    }

//    public void angsur(int angsur) {
//        if (angsur < (jumlahPinjaman * 0.1)) {
//            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
//        } else {
//            jumlahPinjaman -= angsur;
//        }
//    }
}
