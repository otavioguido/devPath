package com.osilva.service;

import com.osilva.model.Message;
import com.osilva.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MessageServiceImpl implements MessageService {

  @Autowired
  private MessageRepository messageRepository;

  @Override
  public void saveMessage(Message message){
    messageRepository.saveAndFlush(message);
  }

  @Override
  public Page<Message> getAllMessages(Pageable pageable){
    return messageRepository.findAll(pageable);
  }

  @Override
  public List<Message> getAllMessagesFromIds(List<UUID> ids){
    return messageRepository.findAllById(ids);
  }

  @Override
  public void deleteMessage(Message message){
    messageRepository.delete(message);
  }
}
