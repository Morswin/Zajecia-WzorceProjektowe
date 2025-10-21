package org.example.strategia.pdfs26;

public class PaymentService {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void processOrder(int amount) {
        strategy.pay(amount);
    }
}
