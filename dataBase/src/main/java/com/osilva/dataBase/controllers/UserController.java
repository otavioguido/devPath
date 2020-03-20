package com.osilva.dataBase.controllers;

import com.osilva.dataBase.exceptions.InvalidUserReferenceException;
import com.osilva.dataBase.models.User;
import com.osilva.dataBase.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
  
  @Autowired UserService userService;

  @PostMapping("/createUser")
  public Long createUser(@RequestBody User user){
    userService.saveUser(user);
    return user.getId();
  }

  @GetMapping("/viewAllUsers")
  public Iterable<User> viewAllUsers(){
    return userService.getAllUsers();
  }

  @GetMapping("/searchUser/{id}")
  public User searchUserById(@PathVariable("id") Long id){
    Optional<User> user = userService.getUser(id);

    if(user.isPresent()){
      return user.get();
    }

    throw new InvalidUserReferenceException(String.format("Invalid user id %l", id));
  }
}
