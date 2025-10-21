package org.example.strategia.pdfs26;

public class Pdfs26 {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.setStrategy(new CreditCardPayment());
        service.processOrder(100);

        service.setStrategy(new PayPalPayment());
        service.processOrder(200);
    }
}
