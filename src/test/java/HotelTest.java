import hotel.Booking;
import hotel.Hotel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
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
    Booking testBooking;
    DiningRoom diningRoom;
    DiningRoom diningRoom2;


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
        testBooking = new Booking(bedroom2, 7);
        diningRoom = new DiningRoom(50, "Big Toni's");
        diningRoom2 = new DiningRoom(100, "Ramen it in your gob!");

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

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedroom2, 7);
        assertEquals(testBooking.getNoOfNights(), booking.getNoOfNights());
        assertEquals(testBooking.getRoom(), booking.getRoom());
    }

    @Test
    public void cannotBookRoomIfOccupied(){
        hotel.bookRoom(bedroom, 7);
        assertEquals(null, hotel.bookRoom(bedroom, 2));
    }

    @Test
    public void canProduceBill(){
        assertEquals(539, hotel.produceBill(testBooking), 0.01);
    }

    @Test
    public void hotelHasDiningRooms(){
        hotel.addDiningRoom(diningRoom);
        hotel.addDiningRoom(diningRoom2);
        DiningRoom actualDiningRoom = hotel.getDiningRooms().get("Ramen it in your gob!");
        assertEquals(100, actualDiningRoom.getCapacity());
    }

    @Test
    public void canGetVacantRooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.bookRoom(bedroom2, 7);
        assertEquals(2, hotel.getVacantRooms(hotel.getBedrooms()).size());
    }
}
