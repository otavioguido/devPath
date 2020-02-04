package com.osilva.dataBase;

import com.osilva.dataBase.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ChatService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id){
        return userRepository.findById(id);
    }
}
