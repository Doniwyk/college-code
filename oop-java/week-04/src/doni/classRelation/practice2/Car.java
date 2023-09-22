package doni.classRelation.practice2;

public class Car {
    private String merk;
    private int cost;

    public Car() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int calculateCost(int days) {
        return cost * days;
    }
}