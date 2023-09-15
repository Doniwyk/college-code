package Assignments.task02;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor KTP\t\t: ");
        String nomorKTP = scanner.nextLine();
        System.out.print("Masukkan nama\t\t\t: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan limit pinjaman\t: ");
        int limitPinjaman = scanner.nextInt();

        Anggota anggota = new Anggota(nomorKTP, nama, limitPinjaman);
        System.out.println("\nNomor KTP\t\t: " + anggota.getNomorKTP());
        System.out.println("Nama Anggota\t: " + anggota.getNama());
        System.out.println("Limit Pinjaman\t: " + anggota.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: ");
        int jumlahPinjaman = scanner.nextInt();
        anggota.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjaman());

        if (anggota.getJumlahPinjaman() > 0) {
            while (anggota.getJumlahPinjaman() > 0) {
                System.out.print("\nMasukkan jumlah angsuran: ");
                int jumlahAngsuran = scanner.nextInt();

                if (jumlahAngsuran >= anggota.getJumlahPinjaman()) {
                    int kembalian = jumlahAngsuran - anggota.getJumlahPinjaman();
                    anggota.angsur(anggota.getJumlahPinjaman());
                    System.out.println("Jumlah pinjaman saat ini: 0");
                    System.out.println("Kembalian: " + kembalian);
                    break;
                } else {
                    anggota.angsur(jumlahAngsuran);
                    System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjaman());
                }
            }
        } else {
            System.out.println("\nTidak ada pinjaman yang harus diangsur.");
        }
    }
}
