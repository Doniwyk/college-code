public class PersegiPanjang extends BangunDatar{
    public float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas(float l) {
        l = panjang * lebar;
        return super.luas(l);
    }

    @Override
    public float keliling(float k) {
        k = 2 * (panjang + lebar);
        return super.keliling(k);
    }
}
