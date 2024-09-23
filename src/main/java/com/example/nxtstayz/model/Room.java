package com.example.nxtstayz.model;

<<<<<<< HEAD
import javax.persistence.*;
import com.example.nxtstayz.model.*;
=======
import com.example.nxtstayz.model.Hotel;
import javax.persistence.*;
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int roomId;
<<<<<<< HEAD
    @Column(name = "roomnumber")
    private String roomName;
    @Column(name = "type")
    private String type;
=======

    @Column(name = "roomnumber")
    private String roomName;

    @Column(name = "type")
    private String type;

>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "hotelid")
    private Hotel hotel;

    public Room() {
    }

    public Room(int roomId, String roomName, String type, double price) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.type = type;
        this.price = price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

<<<<<<< HEAD
    public String getRoomNumber() {
        return roomName;
    }

    public void setRoomNumber(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return type;
    }

    public void setRoomType(String type) {
=======
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
<<<<<<< HEAD

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
=======
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
