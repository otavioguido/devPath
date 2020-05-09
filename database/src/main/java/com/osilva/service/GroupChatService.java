package com.osilva.service;

import com.osilva.model.GroupChat;
import com.osilva.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface GroupChatService {
  void saveGroup(GroupChat groupChat);

  Page<GroupChat> findAllGroupChat(Pageable pageable);

  Page<GroupChat> findGroupChatByUser(User user, PageRequest pageRequest);

  Page<GroupChat> findGroupChatByName(String name, PageRequest pageRequest);

  void deleteGroupChat(GroupChat groupChat);
}
