package rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(3),
    SUITE(10);

    private final int noOfBeds;

    RoomType(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }
}
