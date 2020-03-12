package com.osilva.dataBase.services;

import com.osilva.dataBase.models.GroupChat;
import com.osilva.dataBase.models.IM;
import com.osilva.dataBase.models.Message;
import com.osilva.dataBase.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatService {

    UserRepository userRepository;

    ImRepository imRepository;

    GroupRepository groupRepository;

    MessageRepository messageRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id){ return userRepository.findById(id); }

    public void saveMessage(Message message){ messageRepository.save(message); }

    public Iterable<Message> getMessagesFromChat(Iterable<Long> ids){ return messageRepository.findAllById(ids); }

    public Iterable<Message> getAllMessages() { return messageRepository.findAll(); }

    public void saveIm(IM im){ imRepository.save(im); }

    public Iterable<IM> getImsFromUser(Iterable<Long> ids){ return imRepository.findAllById(ids); }

    public Iterable<IM> getAllIms() { return imRepository.findAll(); }

    public void saveGroup(GroupChat groupChat){ groupRepository.save(groupChat); }

    public Iterable<GroupChat> getGroupsFromUser(Iterable<Long> ids){ return groupRepository.findAllById(ids); }

    public Iterable<GroupChat> getAllGroups() { return groupRepository.findAll(); }
}
