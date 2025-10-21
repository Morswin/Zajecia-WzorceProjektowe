package org.example.strategia.pdfs26;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
