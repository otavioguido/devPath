package com.osilva.service;

import com.osilva.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
  void saveUser(User user);

  Page<User> getAllUsers(Pageable pageable);

  Optional<User> getUser(UUID id);

  void deleteUser(User user);
}
