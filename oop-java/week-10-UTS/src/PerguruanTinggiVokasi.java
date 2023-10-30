public class PerguruanTinggiVokasi extends PerguruanTinggi{
    public PerguruanTinggiVokasi(String nama) {
        super(nama);
    }

    @Override
    public String deskripsiProdi() {
        return "Program studi di " + getNama() + " berfokus pada pendidikan vokasi.";
    }
}
