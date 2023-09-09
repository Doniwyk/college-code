package Task3;

public class Lingkaran {
    public final double phi = 3.14;
    public double r;

    public double hitungLuas() {
        return  phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
