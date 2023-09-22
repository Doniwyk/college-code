package doni.classRelation.practice4;

public class Passenger {
    private String name;
    private String ktp;

    public Passenger() {
    }
    public Passenger(String name, String ktp) {
        this.name = name;
        this.ktp = ktp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.name + "\n";
        info += "KTP: " + this.ktp + "\n";
        return info;
    }
}