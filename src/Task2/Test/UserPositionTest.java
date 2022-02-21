package Task2.Test;

import Task2.Positions;
import Task2.UserPosition;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserPositionTest {

    @Test
    public void getUserPosition() {
        Positions [] positions = Positions.values();
        UserPosition userPosition = new UserPosition();
        userPosition.setUserPosition("Директор");
        assertEquals(Positions.DIRECTOR,userPosition.getUserPosition());
    }
}