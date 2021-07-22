import org.junit.Before;
import org.junit.Test;
import people.Guest;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(121, RoomType.SINGLE);
        guest = new Guest("Barry");
    }

    @Test
    public void canAddGuestToRoom(){
        assertEquals(null, bedroom.addGuest(guest));
        assertEquals(1,bedroom.getCurrentNoOfGuests());
    }

    @Test
    public void cannotAddGuestToRoomAtCapacity(){
        bedroom.addGuest(guest);
        assertEquals("Room is full!", bedroom.addGuest(guest));
        assertEquals(1,bedroom.getCurrentNoOfGuests());
    }

    @Test
    public void roomHasAType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void roomHasANumber(){
        assertEquals(121, bedroom.getRoomNumber());
    }
}
