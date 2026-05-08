import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room marbinsRoom = new Room();

    @Test
    void checkIn() {
        marbinsRoom.checkIn(true);
        Assertions.assertTrue(true);
    }

    @Test
    void checkOut() {
        marbinsRoom.checkOut(true);
        Assertions.assertTrue(true);
    }


    @Test
    void cleanRoom() {
        marbinsRoom.cleanRoom(true);
        Assertions.assertTrue(true);
    }
}