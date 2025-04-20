package workerApp.Repository;
// import com.workersapp.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import workerApp.Entities.Payment;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByUserId(Long userId);
    List<Payment> findByWorkerId(Long workerId);
}
