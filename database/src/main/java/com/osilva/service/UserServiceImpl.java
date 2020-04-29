package com.osilva.service;

import com.osilva.model.User;
import com.osilva.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void saveUser(User user){
    User savedUser = userRepository.saveAndFlush(user);

  }

  @Override
  public Page<User> getAllUsers(Pageable pageable){
    return userRepository.findAll(pageable);
  }

  @Override
  public Optional<User> getUser(UUID id){
    return userRepository.findById(id);
  }

  @Override
  public void deleteUser(User user){
    userRepository.delete(user);
  }
}
