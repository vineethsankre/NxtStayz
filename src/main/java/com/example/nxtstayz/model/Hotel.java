package com.example.nxtstayz.model;

import javax.persistence.*;
<<<<<<< HEAD
import com.example.nxtstayz.model.*;
=======
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int hotelId;
<<<<<<< HEAD
    @Column(name = "name")
    private String hotelName;
    @Column(name = "location")
    private String location;
=======

    @Column(name = "name")
    private String hotelName;

    @Column(name = "location")
    private String location;

>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
    @Column(name = "rating")
    private int rating;

    public Hotel() {
    }

    public Hotel(int hotelId, String hotelName, String location, int rating) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.rating = rating;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
<<<<<<< HEAD
    }
}
=======

    }

}
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
