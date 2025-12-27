package com.examly.springapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "customer_returns")
public class CustomerReturn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate returnDate;
    private Integer quantity;
    private String reason;
    private Long productId;

    public CustomerReturn() {}

    public CustomerReturn(LocalDate returnDate, Integer quantity, String reason, Long productId) {
        this.returnDate = returnDate;
        this.quantity = quantity;
        this.reason = reason;
        this.productId = productId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }
    
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
    
    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }
}