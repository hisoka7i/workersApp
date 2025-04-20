package workerApp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import workerApp.Entities.Booking;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId);
    List<Booking> findByWorkerId(Long workerId);
}
