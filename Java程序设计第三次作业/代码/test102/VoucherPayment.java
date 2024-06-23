package test102;

public class VoucherPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using voucher.");
    }
}
