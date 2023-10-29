public class UjianTulis implements UjianMasuk{
    @Override
    public void jenisUjian(Siswa siswa) {
        siswa.lulus();
    }

    @Override
    public String getJenisUjian() {
        return "Ujian Tulis";
    }
}
