public class Main {
    public static void main(String[] args) {
        Siswa budi = new Siswa("Budi");
        Siswa toni = new Siswa("Toni");

        PerguruanTinggi polinema = new PerguruanTinggiVokasi("Polinema");
        PerguruanTinggi universitasIndonesia = new PerguruanTinggiAkademik("Universitas Indonesia");

        UjianMasuk ujianBudi = new UjianKomputer();
        UjianMasuk ujianToni = new UjianTulis();

        System.out.println(budi.getNama() + " mendaftar di " + polinema.getNama() + " dan " + toni.getNama() + " mendaftar di " + universitasIndonesia.getNama());
        System.out.println(budi.getNama() + " melakukan tes menggunakan " + ujianBudi.getJenisUjian() + " dan " + toni.getNama() + " melakukan tes " + ujianToni.getJenisUjian());

        System.out.println("----------------------------------");
        ujianBudi.jenisUjian(budi);
        ujianToni.jenisUjian(toni);

        budi.setRankTest(500);
        toni.setRankTest(1099);

        budi.isLulus();
        toni.isLulus();

        polinema.umumkanNilai(budi);
        polinema.umumkanNilai(toni);
        System.out.println("----------------------------------");

        System.out.println(budi.getNama() + " berada di urutan " + budi.getRankTest() + "/1000");
        System.out.println(toni.getNama() + " berada di urutan " + toni.getRankTest()+ "/1000");
        System.out.println("----------------------------------");

        polinema.umumkanHasilPenerimaan(budi);
        universitasIndonesia.umumkanHasilPenerimaan(toni);
    }
}
