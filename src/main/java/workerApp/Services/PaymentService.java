package workerApp.Services;

import java.util.List;

import workerApp.Entities.Payment;

public interface PaymentService {
    public Payment savePayment(Payment payment);
    public List<Payment> getPaymentsByUserId(Long userId);
    public List<Payment> getPaymentsByWorkerId(Long workerId);
}
