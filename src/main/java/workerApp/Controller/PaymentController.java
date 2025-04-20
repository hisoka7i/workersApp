package workerApp.Controller;

// import com.workersapp.entities.Payment;
// import com.workersapp.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import workerApp.Entities.Payment;
import workerApp.Services.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public Payment savePayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }

    @GetMapping("/user/{userId}")
    public List<Payment> getUserPayments(@PathVariable Long userId) {
        return paymentService.getPaymentsByUserId(userId);
    }

    @GetMapping("/worker/{workerId}")
    public List<Payment> getWorkerPayments(@PathVariable Long workerId) {
        return paymentService.getPaymentsByWorkerId(workerId);
    }
}