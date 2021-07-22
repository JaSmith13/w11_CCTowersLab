package hotel;

import rooms.Bedroom;

public class Booking {

    private Bedroom bedroom;
    private int noOfNights;

    public Booking(Bedroom bedroom, int noOfNights) {
        this.bedroom = bedroom;
        this.noOfNights = noOfNights;
    }


    public Bedroom getRoom() {
        return this.bedroom;
    }

    public int getNoOfNights() {
        return this.noOfNights;
    }
}
