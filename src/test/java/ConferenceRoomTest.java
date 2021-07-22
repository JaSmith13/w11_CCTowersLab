import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(34, "The Banderas Suite");
    }

    @Test
    public void roomHasName(){
        assertEquals("The Banderas Suite", conferenceRoom.getName());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(34, conferenceRoom.getCapacity());
    }

}
