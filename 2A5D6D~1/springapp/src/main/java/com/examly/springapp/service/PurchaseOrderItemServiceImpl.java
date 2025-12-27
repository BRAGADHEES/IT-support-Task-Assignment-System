package com.examly.springapp.service;

import com.examly.springapp.model.PurchaseOrderItem;
import com.examly.springapp.repository.PurchaseOrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PurchaseOrderItemServiceImpl implements PurchaseOrderItemService {
    
    @Autowired
    private PurchaseOrderItemRepository purchaseOrderItemRepository;

    @Override
    public PurchaseOrderItem createPurchaseOrderItem(PurchaseOrderItem purchaseOrderItem) {
        return purchaseOrderItemRepository.save(purchaseOrderItem);
    }

    @Override
    public List<PurchaseOrderItem> getItemsByPurchaseOrderId(Long purchaseOrderId) {
        return purchaseOrderItemRepository.findByPurchaseOrderId(purchaseOrderId);
    }
}