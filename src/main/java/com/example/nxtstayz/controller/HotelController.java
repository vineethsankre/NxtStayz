<<<<<<< HEAD
package com.example.nxtstayz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.nxtstayz.service.*;
import com.example.nxtstayz.model.*;

@RestController
public class HotelController {
    @Autowired
    private HotelJpaService hotelService;

    @GetMapping("/hotels")
    public ArrayList<Hotel> getHotels() {
        return hotelService.getHotels();
    }

    @GetMapping("/hotels/{hotelId}")
    public Hotel getHotelById(@PathVariable("hotelId") int hotelId) {
        return hotelService.getHotelById(hotelId);
    }

    @PostMapping("/hotels")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }

    @PutMapping("/hotels/{hotelId}")
    public Hotel updateHotel(@PathVariable("hotelId") int hotelId, @RequestBody Hotel hotel) {
        return hotelService.updateHotel(hotelId, hotel);
    }

    @DeleteMapping("/hotels/{hotelId}")
    public void deleteHotel(@PathVariable("hotelId") int hotelId) {
        hotelService.deleteHotel(hotelId);

    }

    @GetMapping("/hotels/{hotelId}/rooms")
    public List<Room> getHotelRooms(@PathVariable("hotelId") int hotelId) {
        return hotelService.getHotelRooms(hotelId);
    }

}
=======
/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
