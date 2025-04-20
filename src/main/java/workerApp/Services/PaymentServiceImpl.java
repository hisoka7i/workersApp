package workerApp.Services;
// import com.workersapp.model.Payment;
// import com.workersapp.repository.PaymentRepository;
// import com.workersapp.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workerApp.Entities.Payment;
import workerApp.Repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getPaymentsByUserId(Long userId) {
        return paymentRepository.findByUserId(userId);
    }

    @Override
    public List<Payment> getPaymentsByWorkerId(Long workerId) {
        return paymentRepository.findByWorkerId(workerId);
    }
}
