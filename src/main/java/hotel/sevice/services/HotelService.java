package hotel.sevice.services;

import hotel.sevice.models.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create (Hotel hotel);
    List<Hotel> getAll();
    Hotel getHotel(String hotelId);
}
