package doni.classRelation.practice2;

public class Customer {
    private String name;
    private Car car;
    private Driver driver;
    private int days;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int calculateTotalCost() {
        return car.calculateCost(days) + driver.calculateWage(days);
    }
}