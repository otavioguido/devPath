package com.osilva.dataBase.services;

import com.osilva.dataBase.models.GroupChat;
import com.osilva.dataBase.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
  @Autowired
  GroupRepository groupRepository;

  public void saveGroup(GroupChat groupChat){ groupRepository.save(groupChat); }

  public Iterable<GroupChat> getGroupsFromUser(Iterable<Long> ids){ return groupRepository.findAllById(ids); }

  public Iterable<GroupChat> getAllGroups() { return groupRepository.findAll(); }
}
