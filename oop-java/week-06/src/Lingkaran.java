public class Lingkaran extends BangunDatar{
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas(float l) {
        l = (float) (Math.PI * r * r);
        return super.luas(l);
    }

    @Override
    public float keliling(float k) {
        k = (float) (2 * Math.PI * r);
        return super.keliling(k);
    }
}
