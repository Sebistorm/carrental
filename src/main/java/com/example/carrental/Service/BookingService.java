package com.example.carrental.Service;

import com.example.carrental.Model.Booking;
import com.example.carrental.Repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepo bookingRepo;

    public List<Booking> fetchAll(){
        return bookingRepo.fetchAll();
    }



    public Booking findBookingById(int id) {
        return bookingRepo.findBookingByID(id);
    }

    public Boolean deleteBooking(int id) {
        return bookingRepo.deleteBooking(id);
    }


    public Booking addBooking(Booking b) {
        return bookingRepo.addBooking(b);
    }


    public void updateBooking (int id, Booking b) {
        bookingRepo.updateBooking(id, b);
    }


}
