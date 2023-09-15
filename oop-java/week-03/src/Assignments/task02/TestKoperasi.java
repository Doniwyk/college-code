package Assignments.task02;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor KTP: ");
        String nomorKTP = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan limit pinjaman: ");
        int limitPinjaman = scanner.nextInt();

        Anggota anggota = new Anggota(nomorKTP, nama, limitPinjaman);
        System.out.println("Nama Anggota: " + anggota.getNama());
        System.out.println("Limit Pinjaman: " + anggota.getLimitPinjaman());

        System.out.println("\nMasukkan jumlah pinjaman: ");
        int jumlahPinjaman = scanner.nextInt();
        anggota.pinjam(jumlahPinjaman);
        System.out.println("Jum lah pinjaman saat ini: " + anggota.getJumlahPinjaman());

        while (anggota.getJumlahPinjaman() > 0) {
            System.out.print("\nMasukkan jumlah angsuran: ");
            int jumlahAngsuran = scanner.nextInt();
            if (jumlahAngsuran > anggota.getJumlahPinjaman()) {
                if (anggota.getJumlahPinjaman() <= 0) {
                    System.out.println("Jumlah pinjaman anda 0");
                } else {
                    System.out.println("Jumlah angsuran melebihi jumlah pinjaman");
                }
            } else {
                anggota.angsur(jumlahAngsuran);
                int currentJumlahPinjaman = anggota.getJumlahPinjaman();
                System.out.println("Jumlah pinjaman saat ini: " + (currentJumlahPinjaman >= 0 ? currentJumlahPinjaman : 0));
            }
        }

        System.out.print("\nMasukkan jumlah angsuran: ");
        int jumlahAngsuran = scanner.nextInt();
        anggota.angsur(jumlahAngsuran);
        System.out.print("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjaman());
    }
}
