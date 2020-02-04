package com.osilva.dataBase;

import com.osilva.dataBase.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    ChatService chatService;

    @PostMapping("/createUser")
    public Long createUser(@RequestBody User user){
        chatService.saveUser(user);
        return user.getId();
    }

    @GetMapping("/viewAllUsers")
    public Iterable<User> viewAllUsers(){
        return chatService.getAllUsers();
    }

    @GetMapping("/searchUser/{id}")
    public User searchUserById(@PathVariable ("id") Long id){
        Optional<User> user = chatService.getUser(id);

        if(user.isPresent()){
            return user.get();
        }

        throw new InvalidUserReferenceException(String.format("Invalid user id %l", id));
    }
}
