import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {


    @Test
    void checkIn() {
        Room marbinsRoom = new Room();
        // This should make room occupied and dirty
        marbinsRoom.checkIn();


        boolean actualIsDirty = marbinsRoom.isDirty();

        boolean actualIsOccupied = marbinsRoom.getIsOccupied();

        Assertions.assertTrue(actualIsDirty);
        Assertions.assertTrue(actualIsOccupied);
    }

//    @Test
//    void checkOut() {
//        marbinsRoom.checkOut();
//        Assertions.assertTrue(true);
//    }
//
//
//    @Test
//    void cleanRoom() {
//        marbinsRoom.cleanRoom();
//        Assertions.assertTrue(true);
//    }
}