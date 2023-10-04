public class Segitiga extends BangunDatar{
    public float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas(float l) {
        l = (alas * tinggi) / 2;
        return super.luas(l);
    }

    @Override
    public float keliling(float k) {
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        k = 2 * alas + sisiMiring;
        return super.keliling(k);
    }
}
