package interfaceclass;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        mahasiswa.kuliahDiKampus();

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("--------------------------------------------");
    }
}
