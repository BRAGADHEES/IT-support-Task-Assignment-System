package com.examly.springapp.service;

import com.examly.springapp.model.PurchaseOrderItem;
import java.util.List;

public interface PurchaseOrderItemService {
    PurchaseOrderItem createPurchaseOrderItem(PurchaseOrderItem purchaseOrderItem);
    List<PurchaseOrderItem> getItemsByPurchaseOrderId(Long purchaseOrderId);
}