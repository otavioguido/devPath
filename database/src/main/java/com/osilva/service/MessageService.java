package com.osilva.service;

import com.osilva.model.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface MessageService {
  void saveMessage(Message message);

  Page<Message> getAllMessages(Pageable pageable);

  List<Message> getAllMessagesFromIds(List<UUID> ids);

  void deleteMessage(Message message);
}
