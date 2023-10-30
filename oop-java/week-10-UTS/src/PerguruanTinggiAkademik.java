public class PerguruanTinggiAkademik extends PerguruanTinggi{
    public PerguruanTinggiAkademik(String nama) {
        super(nama);
    }

    @Override
    public String deskripsiProdi() {
        return "Program studi di " + getNama() + " berfokus pada pendidikan akademik.";
    }
}
