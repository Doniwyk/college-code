package abstractclass;

public abstract class Animal {
    private int umur;

    protected Animal() {
        this.umur = 0;
    }

    public void bertambahUmur() {
        this.umur++;
    }

    public abstract void bergerak();
}
