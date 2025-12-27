package com.examly.springapp.repository;

import com.examly.springapp.model.CustomerReturn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReturnRepository extends JpaRepository<CustomerReturn, Long> {
}