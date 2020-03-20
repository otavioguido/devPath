package com.osilva.dataBase.services;

import com.osilva.dataBase.models.GroupChat;
import com.osilva.dataBase.models.IM;
import com.osilva.dataBase.models.Message;
import com.osilva.dataBase.models.User;
import com.osilva.dataBase.repositories.GroupRepository;
import com.osilva.dataBase.repositories.ImRepository;
import com.osilva.dataBase.repositories.MessageRepository;
import com.osilva.dataBase.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public void saveMessage(Message message){ messageRepository.save(message); }

    public Iterable<Message> getMessagesFromChat(Iterable<Long> ids){ return messageRepository.findAllById(ids); }

    public Iterable<Message> getAllMessages() { return messageRepository.findAll(); }
}
