package doni.classRelation.practice4;

public class Wagon {
    private String code;
    private Seat[] seats;

    public Wagon(String code, int seatTotal) {
        this.code = code;
        this.seats = new Seat[seatTotal];
        this.initSeats();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public void initSeats() {
        for (int i = 0; i < this.seats.length; i++) {
            this.seats[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + this.code + "\n";
        for (Seat seat : this.seats) {
            info += seat.info() + "\n";
        }
        return info;
    }

    public void setPassenger(Passenger passenger, int seatNumber) {
        if (this.seats[seatNumber - 1].getPassenger() != null) {
            System.out.println("Kursi sudah terisi");
        } else {
            this.seats[seatNumber - 1].setPassenger(passenger);
        }
    }
}