package com.examly.springapp.controller;

import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.service.CustomerReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customer-returns")
public class CustomerReturnController {
    
    @Autowired
    private CustomerReturnService customerReturnService;

    @PostMapping
    public ResponseEntity<CustomerReturn> createCustomerReturn(@RequestBody CustomerReturn customerReturn) {
        CustomerReturn created = customerReturnService.createCustomerReturn(customerReturn);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public ResponseEntity<List<CustomerReturn>> getAllCustomerReturns() {
        List<CustomerReturn> returns = customerReturnService.getAllCustomerReturns();
        return ResponseEntity.ok(returns);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerReturn> getCustomerReturnById(@PathVariable Long id) {
        CustomerReturn customerReturn = customerReturnService.getCustomerReturnById(id);
        return customerReturn != null ? ResponseEntity.ok(customerReturn) : ResponseEntity.notFound().build();
    }
}