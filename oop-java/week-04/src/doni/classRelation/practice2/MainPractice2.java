package doni.classRelation.practice2;

public class MainPractice2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMerk("Avanza");
        car.setCost(350000);
        Driver driver = new Driver();
        driver.setName("John Doe");
        driver.setWage(200000);
        Customer customer = new Customer();
        customer.setName("Jane Doe");
        customer.setCar(car);
        customer.setDriver(driver);
        customer.setDays(2);
        System.out.println("Total cost: " + customer.calculateTotalCost());
        System.out.println(customer.getCar().getMerk());
    }
}