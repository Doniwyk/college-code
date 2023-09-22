package doni.classRelation.practice2;

public class Driver {
    private String name;
    private int wage;

    public Driver() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int calculateWage(int days) {
        return wage * days;
    }
}