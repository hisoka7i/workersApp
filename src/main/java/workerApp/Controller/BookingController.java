package workerApp.Controller;

// import com.workersapp.entities.Booking;
// import com.workersapp.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import workerApp.Entities.Booking;
import workerApp.Services.BookingService;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking bookWorker(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getUserBookings(@PathVariable Long userId) {
        return bookingService.getBookingsByUserId(userId);
    }

    @GetMapping("/worker/{workerId}")
    public List<Booking> getWorkerBookings(@PathVariable Long workerId) {
        return bookingService.getBookingsByWorkerId(workerId);
    }
}
