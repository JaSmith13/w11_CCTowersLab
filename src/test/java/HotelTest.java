import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(20, RoomType.DOUBLE);
        bedroom2 = new Bedroom(30, RoomType.SINGLE);
        bedroom3 = new Bedroom(9000, RoomType.SUITE);
        conferenceRoom = new ConferenceRoom(20, "Banderas");
        conferenceRoom2 = new ConferenceRoom(30, "Stallone");
        conferenceRoom3 = new ConferenceRoom(40,"Moore");
        hotel = new Hotel();
        guest = new Guest("Antonio");
    }

    @Test
    public void hotelStartsWithNoRooms(){
        assertEquals(0, hotel.getNoOfBedrooms());
        assertEquals(0, hotel.getNoOfConferenceRooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNoOfBedrooms());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getNoOfConferenceRooms());
    }
    
    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getCurrentNoOfGuests());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkInGuest(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.getCurrentNoOfGuests());
    }
}
