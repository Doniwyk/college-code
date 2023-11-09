package interfaceclass;

public class PascaSarjana extends Mahasiswa implements ICumlaude{
    public PascaSarjana(String name) {
        super(name);
    }

    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3.71");
    }
}
