public abstract class PerguruanTinggi {
    protected String nama;

    public PerguruanTinggi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void umumkanNilai(Siswa siswa) {
        System.out.println("Hasil nilai" + " untuk " + siswa.getNama() + ": " + (siswa.isPassingGrade() ? "Memenuhi passing grade" : "Tidak memenuhi passing grade"));
    }

    public void umumkanHasilPenerimaan(Siswa siswa) {
        System.out.println("Hasil penerimaan di " + this.nama + " untuk " + siswa.getNama() + ": " + (siswa.isLulus() ? "Diterima" : "Tidak diterima"));
    }

    public abstract String deskripsiProdi();
}
