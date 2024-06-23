package test102;

public class WeChatPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using WeChat.");
    }
}
