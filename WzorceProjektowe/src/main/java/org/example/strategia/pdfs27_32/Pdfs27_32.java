package org.example.strategia.pdfs27_32;

import java.util.HashMap;
import java.util.Map;

public class Pdfs27_32 {
    public static void main(String[] args) {
        Map<String, PaymentStrategy> strategies = new HashMap<>();
        strategies.put("card", amount -> System.out.println("Paid " + amount + " using credit card"));
        strategies.put("paypal", amount -> System.out.println("Paid " + amount + " using PayPal"));

        PaymentService service = new PaymentService();
        service.setStrategy(strategies.get("card"));
        service.processOrder(100);

        service.setStrategy(strategies.get("paypal"));
        service.processOrder(200);
    }
}
