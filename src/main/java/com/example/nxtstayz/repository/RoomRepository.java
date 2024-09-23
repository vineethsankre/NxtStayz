package com.example.nxtstayz.repository;

<<<<<<< HEAD
import com.example.nxtstayz.model.*;
import java.util.ArrayList;
=======
import java.util.ArrayList;
import com.example.nxtstayz.model.Room;
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2

public interface RoomRepository {
    ArrayList<Room> getRooms();

    Room getRoomById(int roomId);

    Room addRoom(Room room);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

<<<<<<< HEAD
    Hotel getRoomHotel(int roomId);
}
=======
}
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
