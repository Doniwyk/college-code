package interfaceclass;

public class Mahasiswa {
    protected String name;

    public Mahasiswa(String name) {
        this.name = name;
    }

    public void kuliahDiKampus() {
        System.out.println("Aku mahasiswa, namaku " + this.name);
        System.out.println("Aku berkuliah di kampus.");
    }
}
