package com.osilva.dataBase;

import com.osilva.dataBase.models.Group;
import com.osilva.dataBase.models.IM;
import com.osilva.dataBase.models.Message;
import com.osilva.dataBase.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ChatController {

    @Autowired
    ChatService chatService;

    @PostMapping("/createUser")
    public Long createUser(@RequestBody User user){
        chatService.saveUser(user);
        return user.getId();
    }

    @PostMapping("/saveMessage")
    public Long saveMessage(@RequestBody Message message){
        chatService.saveMessage(message);
        return message.getId();
    }

    @PostMapping("/createIM")
    public Long createIM(@RequestBody IM im){
        chatService.saveIm(im);
        return im.getId();
    }

    @PostMapping("/createGroup")
    public Long createGroup(@RequestBody Group group){
        chatService.saveGroup(group);
        return group.getId();
    }

    @GetMapping("/getMessages")
    public Iterable<Message> getMessagesFromChat(Iterable<Long> ids) {return chatService.getMessagesFromChat(ids); }

    @GetMapping("/getAllMessages")
    public Iterable<Message> getAllMessages() { return chatService.getAllMessages(); }

    @GetMapping("/getIms")
    public Iterable<IM> getIMs(Iterable<Long> ids) { return chatService.getImsFromUser(ids); }

    @GetMapping("/getAllIms")
    public Iterable<IM> getAllIms() { return chatService.getAllIms(); }

    @GetMapping("/getGroups")
    public Iterable<Group> getGroups(Iterable<Long> ids) { return  chatService.getGroupsFromUser(ids); }

    @GetMapping("/getAllGroups")
    public Iterable<Group> getAllGroups() { return chatService.getAllGroups(); }

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
