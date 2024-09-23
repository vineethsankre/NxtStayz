package com.example.nxtstayz.repository;

<<<<<<< HEAD
import com.example.nxtstayz.model.*;
import java.util.*;
=======
import java.util.ArrayList;
import com.example.nxtstayz.model.Hotel;
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2

public interface HotelRepository {
    ArrayList<Hotel> getHotels();

    Hotel getHotelById(int hotelId);

    Hotel addHotel(Hotel hotel);

    Hotel updateHotel(int hotelId, Hotel hotel);

    void deleteHotel(int hotelId);

<<<<<<< HEAD
    List<Room> getHotelRooms(int hotelId);
=======
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
}