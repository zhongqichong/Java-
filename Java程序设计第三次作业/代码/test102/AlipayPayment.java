package test102;

public class AlipayPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Alipay.");
    }
}
