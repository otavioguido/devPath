package com.osilva.service;

import com.osilva.model.GroupChat;
import com.osilva.model.User;
import com.osilva.repository.GroupChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GroupChatServiceImpl {
  @Autowired
  private GroupChatRepository repository;

  public void saveGroup(GroupChat groupChat){
    repository.saveAndFlush(groupChat);
  }

  public Page<GroupChat> findAllGroupChat(Pageable pageable){
    return repository.findAll(pageable);
  }

  public Page<GroupChat> findGroupChatByName(User user){
    return repository.findByUsers(user);
  }

  //public Page<>
}
