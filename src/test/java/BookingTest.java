import hotel.Booking;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;

    @Before
    public void before(){
        bedroom = new Bedroom(234, RoomType.FAMILY);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void bookingHasARoomAssociated(){
        assertEquals(bedroom, booking.getRoom());
    }

    @Test
    public void bookingHasANoOfNights(){
        assertEquals(5,booking.getNoOfNights());
    }
}
