package rooms;

import people.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentNoOfGuests(){
        return this.guests.size();
    }

    public String addGuest(Guest guest){
        if(guests.size() < capacity){
            guests.add(guest);
            return null;
        }
        return "Room is full!";
    }
}
