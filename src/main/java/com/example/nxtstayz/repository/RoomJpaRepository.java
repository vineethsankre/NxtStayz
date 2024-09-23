package com.example.nxtstayz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD

import com.example.nxtstayz.model.*;
import java.util.*;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room, Integer> {
    List<Room> findByHotel(Hotel hotel);
=======
import com.example.nxtstayz.model.Room;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room, Integer> {
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2

}
