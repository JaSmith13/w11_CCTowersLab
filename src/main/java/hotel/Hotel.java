package hotel;

import people.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
    }

    public int getNoOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNoOfConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuest(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int noOfNights) {
        if(bedroom.isOccupied() == false) {
            bedroom.setOccupied(true);
            return new Booking(bedroom, noOfNights);
        }
        return null;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList getVacantRooms(ArrayList<Bedroom> bedrooms) {
        ArrayList<Bedroom> vacantRooms = new ArrayList<>();
        for(Bedroom bedroom : bedrooms){
            if(bedroom.isOccupied() == false){
                vacantRooms.add(bedroom);
            }
        }
        return vacantRooms;
    }

    public double produceBill(Booking booking) {
       double rate = booking.getRoom().getNightlyRate();
       int nights = booking.getNoOfNights();
       return rate * nights;
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }
}
