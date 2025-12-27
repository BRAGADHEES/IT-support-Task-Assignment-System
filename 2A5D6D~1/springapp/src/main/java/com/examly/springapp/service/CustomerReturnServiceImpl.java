package com.examly.springapp.service;

import com.examly.springapp.model.CustomerReturn;
import com.examly.springapp.repository.CustomerReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerReturnServiceImpl implements CustomerReturnService {
    
    @Autowired
    private CustomerReturnRepository customerReturnRepository;

    @Override
    public CustomerReturn createCustomerReturn(CustomerReturn customerReturn) {
        return customerReturnRepository.save(customerReturn);
    }

    @Override
    public List<CustomerReturn> getAllCustomerReturns() {
        return customerReturnRepository.findAll();
    }

    @Override
    public CustomerReturn getCustomerReturnById(Long id) {
        return customerReturnRepository.findById(id).orElse(null);
    }
}