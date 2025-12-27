package com.examly.springapp.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "purchase_order_items")
public class PurchaseOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer quantity;
    private BigDecimal unitPrice;
    private Long purchaseOrderId;
    private Long productId;

    public PurchaseOrderItem() {}

    public PurchaseOrderItem(Integer quantity, BigDecimal unitPrice, Long purchaseOrderId, Long productId) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.purchaseOrderId = purchaseOrderId;
        this.productId = productId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    
    public BigDecimal getUnitPrice() { return unitPrice; }
    public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }
    
    public Long getPurchaseOrderId() { return purchaseOrderId; }
    public void setPurchaseOrderId(Long purchaseOrderId) { this.purchaseOrderId = purchaseOrderId; }
    
    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }
}