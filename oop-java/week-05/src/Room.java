public class Room {
    private String roomNumber;
    private boolean occupied;
    private String patientId;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
        occupied = false;
        this.patientId = null;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void assignPatient() {
        occupied = true;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void dischargePatient() {
        occupied = false;
    }

    public void displayInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Occupied: " + (occupied ? "Yes" : "No"));
    }

}
