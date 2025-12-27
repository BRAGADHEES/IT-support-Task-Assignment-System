package com.examly.springapp.service;

import com.examly.springapp.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User updateUser(Long id, User user);
    Page<User> getUsersWithPagination(Pageable pageable);
    List<User> getUsersByRole(String role);
}
