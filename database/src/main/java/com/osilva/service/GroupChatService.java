package com.osilva.service;

import com.osilva.model.GroupChat;
import com.osilva.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface GroupChatService {
  void saveGroup(GroupChat groupChat);

  Page<GroupChat> findAllGroupChat(Pageable pageable);

  void deleteGroupChat(GroupChat groupChat);
}
