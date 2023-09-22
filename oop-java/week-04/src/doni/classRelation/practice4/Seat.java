package doni.classRelation.practice4;

public class Seat {
    private String number;
    private Passenger passenger;

    public Seat(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + this.number + "\n"  ;
        if (this.passenger != null) {
            info += "Penumpang: "  + "\n" + this.passenger.info();
        }
        return info;
    }
}