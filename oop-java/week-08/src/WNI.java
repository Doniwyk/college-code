public abstract class WNI {
    boolean alive = true;

    public abstract void buatPasspord();
}

interface MakhlukHidup {
    boolean status = true;

    public boolean isAlive();
}

interface Mayat {
    boolean status = false;

    public boolean isAlive();
}

class MAMAT extends WNI implements Mayat {
    String name = "Mamat";

    @Override
    public void buatPasspord() {
    }

    @Override
    public boolean isAlive() {
        return alive;
    }
}

//class App {
//    public static void main(String[] args) {
//        MAMAT siMamat = new MAMAT();
//        System.out.println((siMamat instanceof MakhlukHidup) ? "" : siMamat.status);
//        System.out.println((siMamat instanceof Mayat) ? siMamat.status : "");
//    }
//}

class Main {
    public static void main(String[] args) {
        MAMAT mamat = new MAMAT();

        System.out.println("Nama: " + mamat.name);
        System.out.println("Status Mayat: " + Mayat.status);
        System.out.println("Status Makhluk Hidup: " + MakhlukHidup.status);
    }
}
