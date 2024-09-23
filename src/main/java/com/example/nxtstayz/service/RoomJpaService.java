<<<<<<< HEAD
package com.example.nxtstayz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;
import com.example.nxtstayz.repository.*;
import com.example.nxtstayz.model.*;

@Service
public class RoomJpaService implements RoomRepository {
	@Autowired
	private RoomJpaRepository roomJpaRepository;
	@Autowired
	private HotelJpaRepository hotelJpaRepository;

	@Override
	public ArrayList<Room> getRooms() {
		List<Room> roomList = roomJpaRepository.findAll();
		ArrayList<Room> rooms = new ArrayList<>(roomList);
		return rooms;

	}

	@Override
	public Room getRoomById(int roomId) {
		try {
			return roomJpaRepository.findById(roomId).get();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public Room addRoom(Room room) {
		try {
			int hotelId = room.getHotel().getHotelId();
			Hotel hotel = hotelJpaRepository.findById(hotelId).get();
			room.setHotel(hotel);
			return roomJpaRepository.save(room);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public Room updateRoom(int roomId, Room room) {
		try {
			Room newRoom = roomJpaRepository.findById(roomId).get();
			if (room.getRoomNumber() != null) {
				newRoom.setRoomNumber(room.getRoomNumber());
			}
			if (room.getRoomType() != null) {
				newRoom.setRoomType(room.getRoomType());
			}
			if (room.getPrice() != 0) {
				newRoom.setPrice(room.getPrice());
			}
			if (room.getHotel() != null) {
				int hotelId = room.getHotel().getHotelId();
				Hotel hotel = hotelJpaRepository.findById(hotelId).get();
				newRoom.setHotel(hotel);
			}
			return roomJpaRepository.save(newRoom);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public void deleteRoom(int roomId) {
		try {
			roomJpaRepository.deleteById(roomId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		throw new ResponseStatusException(HttpStatus.NO_CONTENT);

	}

	@Override
	public Hotel getRoomHotel(int roomId) {
		try {
			Room room = roomJpaRepository.findById(roomId).get();
			return room.getHotel();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}

}
=======
/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
