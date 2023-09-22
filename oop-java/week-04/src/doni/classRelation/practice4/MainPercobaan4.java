package doni.classRelation.practice4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Mr. Krab", "12345");
        Wagon wagon = new Wagon("A", 10);
        wagon.setPassenger(passenger, 1);

        Passenger budi = new Passenger("Budi", "12345");
        wagon.setPassenger(budi, 1);

        System.out.println(wagon.info());
    }
}