package rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;
    private boolean occupied;

    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType.getNoOfBeds());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = (roomType.getNoOfBeds() * 77);
        this.occupied = false;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}

