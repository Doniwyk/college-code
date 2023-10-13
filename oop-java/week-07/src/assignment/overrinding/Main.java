package assignment.overrinding;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        System.out.println("== Class Manusia ==");
        manusia.bernafas();
        manusia.makan();

        Dosen dosen = new Dosen();
        System.out.println("\n== Class Dosen ==");
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();

        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("\n== Class Mahasiswa ==");
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
