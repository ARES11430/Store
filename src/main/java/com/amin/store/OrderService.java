package com.amin.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private final PaymentService paymentService;

    //@Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostConstruct
    public void init(){
        System.out.println("Order Service PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Order Service PreDestroy");
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
