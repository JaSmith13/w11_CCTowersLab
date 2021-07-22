import org.junit.Before;
import org.junit.Test;
import people.Guest;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Danny");
    }

    @Test
    public void guestHasName(){
        assertEquals("Danny", guest.getName());
    }

    @Test
    public void canChangeGuestName(){
        guest.setName("Danny Dyer");
        assertEquals("Danny Dyer", guest.getName());
    }
}
