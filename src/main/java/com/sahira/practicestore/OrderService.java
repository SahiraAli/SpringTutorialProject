package com.sahira.practicestore;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

//    public void setPaymentService(PaymentService paymentService) { //setter injection
//        this.paymentService = paymentService;
//    }

    public OrderService(PaymentService paymentService) { //dependency injected
        this.paymentService = paymentService;
    }

    public void placeOrder(){
//        var paymentService = new StripePaymentService();
        paymentService.processPayment(100.0);
    }
}
