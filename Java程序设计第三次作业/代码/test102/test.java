package test102;

public class test {
    public static void main(String[] args) {
        // 使用现金支付
        Payment cashPayment = new CashPayment();
        PaymentProcessor cashProcessor = new PaymentProcessor(cashPayment);
        cashProcessor.processPayment(100.0);

        // 使用信用卡支付
        Payment creditCardPayment = new CreditCardPayment();
        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCardPayment);
        creditCardProcessor.processPayment(200.0);

        // 使用微信支付
        Payment weChatPayment = new WeChatPayment();
        PaymentProcessor weChatProcessor = new PaymentProcessor(weChatPayment);
        weChatProcessor.processPayment(300.0);
    }
}
