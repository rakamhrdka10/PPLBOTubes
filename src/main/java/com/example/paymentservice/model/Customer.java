package com.example.paymentservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_placeholder")
public class Customer {
    @Id
    private Long id;

    // No additional fields or methods

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
