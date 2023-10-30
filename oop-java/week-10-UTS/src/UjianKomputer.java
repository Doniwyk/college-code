public class UjianKomputer implements IUjianMasuk {
    @Override
    public void jenisUjian(Siswa siswa) {
        siswa.lulus();
    }

    @Override
    public String getJenisUjian() {
        return "Ujian Komputer";
    }
}