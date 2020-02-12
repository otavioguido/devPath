package com.osilva.dataBase;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.osilva.dataBase.models.GroupChat;
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

    @PostMapping("/saveMessage")
    public Long saveMessage(@RequestBody Message message){
        chatService.saveMessage(message);
        return message.getId();
    }

    @GetMapping("/getMessages")
    public Iterable<Message> getMessagesFromChat(Iterable<Long> ids) {return chatService.getMessagesFromChat(ids); }

    @GetMapping("/getAllMessages")
    public Iterable<Message> getAllMessages() { return chatService.getAllMessages(); }

    @PostMapping("/createIM")
    public Long createIM(@RequestBody ObjectNode json){
        User user1 = searchUserById((Long) json.get("user1").asLong());
        User user2 = searchUserById((Long) json.get("user2").asLong());

        IM im = new IM();
        im.getUsers().add(user1);
        im.getUsers().add(user2);
        user1.getIms().add(im);
        user2.getIms().add(im);
        chatService.saveIm(im);
        chatService.saveUser(user1);
        chatService.saveUser(user2);
        return im.getId();
    }

    @GetMapping("/getIms")
    public Iterable<IM> getIMs(Iterable<Long> ids) { return chatService.getImsFromUser(ids); }

    @GetMapping("/getAllIms")
    public Iterable<IM> getAllIms() { return chatService.getAllIms(); }

    @PostMapping("/createGroup")
    public Long createGroup(@RequestBody GroupChat groupChat){
        chatService.saveGroup(groupChat);
        return groupChat.getId();
    }

    @GetMapping("/getGroups")
    public Iterable<GroupChat> getGroups(Iterable<Long> ids) { return  chatService.getGroupsFromUser(ids); }

    @GetMapping("/getAllGroups")
    public Iterable<GroupChat> getAllGroups() { return chatService.getAllGroups(); }
}
