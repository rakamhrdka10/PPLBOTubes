package com.example.paymentservice.controller;

import com.example.paymentservice.model.Payment;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<Payment> processPayment(@RequestParam Long orderId, @RequestBody Payment payment) {
        Payment processedPayment = paymentService.processPayment(orderId, payment);
        return ResponseEntity.ok(processedPayment);
    }

    @PostMapping("/refund")
    public ResponseEntity<Payment> refundPayment(@RequestParam Long paymentId) {
        Payment refundedPayment = paymentService.refundPayment(paymentId);
        return ResponseEntity.ok(refundedPayment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id) {
        Payment payment = paymentService.getPayment(id);
        return ResponseEntity.ok(payment);
    }
}
