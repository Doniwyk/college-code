package Assignment;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= (int) (0.112 * strength);
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength;
    }

    public void destroy() {
        destroyed();
    }
}
