package com.osilva.dataBase.controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.osilva.dataBase.exceptions.InvalidUserReferenceException;
import com.osilva.dataBase.models.GroupChat;
import com.osilva.dataBase.models.IM;
import com.osilva.dataBase.models.Message;
import com.osilva.dataBase.models.User;
import com.osilva.dataBase.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping("/saveMessage")
    public Long saveMessage(@RequestBody Message message){
        messageService.saveMessage(message);
        return message.getId();
    }

    @GetMapping("/getMessages")
    public Iterable<Message> getMessagesFromChat(Iterable<Long> ids) {return messageService.getMessagesFromChat(ids); }

    @GetMapping("/getAllMessages")
    public Iterable<Message> getAllMessages() { return messageService.getAllMessages(); }
}
