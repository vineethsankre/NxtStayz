create table if not exists hotel(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
<<<<<<< HEAD
    name TEXT,
    location TEXT,
=======
    name TEXT, 
    location TEXT, 
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
    rating INTEGER
);

create table if not exists room(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    roomNumber TEXT,
    type TEXT,
<<<<<<< HEAD
    price DOUBLE,
    hotelId INTEGER,
=======
    price DOUBLE, 
    hotelId INTEGER, 
>>>>>>> 57cc032ec122f08fb211f9836f456d99961d7cc2
    FOREIGN KEY (hotelId) REFERENCES hotel(id)
);