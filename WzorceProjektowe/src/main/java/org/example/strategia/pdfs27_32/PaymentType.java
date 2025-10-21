package org.example.strategia.pdfs27_32;

public enum PaymentType {
    CREDIT_CARD(amount -> System.out.println("Paid " + amount + " using credit card")),
    PAYPAL(amount -> System.out.println("Paid " + amount + " using paypal")),
    CASH(amount -> System.out.println("Paid " + amount + " using credit card"));
    private final PaymentStrategy strategy;
    PaymentType(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay(int amount) {
        strategy.pay(amount);
    }
}
