package practice_1;
import java.util.*;
public class Kota {
    String id, nama;

    public Kota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public static void main(String[] args) {
        Set batu = new HashSet();
        Set batu2 = batu;

        batu.add(new Kota("1", "Batu"));

        List listCity = new ArrayList();
        listCity.addAll(batu);
        listCity.addAll(batu2);
        listCity.add(new Kota("3", "Malang"));

        for (Object city : listCity) {
            if (city instanceof Kota) {
                System.out.println(((Kota) city).getNama());
            }
        }
    }
}

