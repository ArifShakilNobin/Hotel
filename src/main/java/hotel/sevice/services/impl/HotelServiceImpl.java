package hotel.sevice.services.impl;

import hotel.sevice.exceptions.ResourceNotFoundException;
import hotel.sevice.models.Hotel;
import hotel.sevice.repositories.HotelRepository;
import hotel.sevice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("hotel with given id is not found on server !!:"+hotelId));
    }
}
