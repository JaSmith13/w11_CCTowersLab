package rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType.getNoOfBeds());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}

