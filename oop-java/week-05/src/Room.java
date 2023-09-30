public class Room {
    private final String roomId;
    private boolean occupied;

    public Room(String roomId) {
        this.roomId = roomId;
        this.occupied = false;
    }

    public String getRoomId() {
        return roomId;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        occupied = true;
    }

    public void vacate() {
        occupied = false;
    }

    public void displayInfo() {
        System.out.println("Room Information:");
        System.out.println("Room ID: " + roomId);
        System.out.println("Occupied: " + (occupied ? "Yes" : "No"));
    }
}
