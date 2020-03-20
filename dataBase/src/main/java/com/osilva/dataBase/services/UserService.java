package com.osilva.dataBase.services;

import com.osilva.dataBase.models.User;
import com.osilva.dataBase.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;

  public void saveUser(User user){
    userRepository.save(user);
  }

  public Iterable<User> getAllUsers(){
    return userRepository.findAll();
  }

  public Optional<User> getUser(Long id){ return userRepository.findById(id); }
}
