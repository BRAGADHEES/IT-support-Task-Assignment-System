package com.examly.springapp.controller;

import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.service.PurchaseOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/purchase-order-items")
public class PurchaseOrderItemController {
    
    @Autowired
    private PurchaseOrderItemService purchaseOrderItemService;

    @PostMapping
    public ResponseEntity<PurchaseOrderItem> createPurchaseOrderItem(@RequestBody PurchaseOrderItem purchaseOrderItem) {
        PurchaseOrderItem created = purchaseOrderItemService.createPurchaseOrderItem(purchaseOrderItem);
        return ResponseEntity.ok(created);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<List<PurchaseOrderItem>> getItemsByPurchaseOrderId(@PathVariable Long id) {
        List<PurchaseOrderItem> items = purchaseOrderItemService.getItemsByPurchaseOrderId(id);
        return ResponseEntity.ok(items);
    }
}