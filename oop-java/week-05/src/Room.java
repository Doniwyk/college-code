public class Room {
    private String roomNumber;
    private boolean occupied;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
        occupied = false;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void assignPatient() {
        occupied = true;
    }

    public void dischargePatient() {
        occupied = false;
    }

    public void displayInfo() {
        System.out.println("Room Information:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Occupied: " + (occupied ? "Yes" : "No"));
    }
}
