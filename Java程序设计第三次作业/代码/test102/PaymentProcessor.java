package test102;

public class PaymentProcessor {
    private Payment paymentMethod;

    public PaymentProcessor(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
