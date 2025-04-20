package workerApp.Services;

import java.util.List;

import workerApp.Entities.Booking;

public interface BookingService {
    public Booking saveBooking(Booking booking);
    public List<Booking> getBookingsByUserId(Long userId);
    public List<Booking> getBookingsByWorkerId(Long workerId);
}
