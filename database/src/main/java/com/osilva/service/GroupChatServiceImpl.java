package com.osilva.service;

import com.osilva.model.GroupChat;
import com.osilva.model.User;
import com.osilva.repository.GroupChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GroupChatServiceImpl implements GroupChatService {

  @Autowired
  private GroupChatRepository repository;

  @Override
  public void saveGroup(GroupChat groupChat){
    repository.saveAndFlush(groupChat);
  }

  @Override
  public Page<GroupChat> findAllGroupChat(Pageable pageable){
    return repository.findAll(pageable);
  }

  @Override
  public Page<GroupChat> findGroupChatByUser(User user, PageRequest pageRequest){
    return repository.findByUsers(user, pageRequest);
  }

  @Override
  public Page<GroupChat> findGroupChatByName(String name, PageRequest pageRequest){
    return repository.findByName(name, pageRequest);
  }

  @Override
  public void deleteGroupChat(GroupChat groupChat) {
    repository.delete(groupChat);
  }
}
