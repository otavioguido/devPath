package com.osilva.dataBase.controllers;

import com.osilva.dataBase.models.GroupChat;
import com.osilva.dataBase.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {
  
  @Autowired GroupService groupService;

  @PostMapping("/createGroup")
  public Long createGroup(@RequestBody GroupChat groupChat){
    groupService.saveGroup(groupChat);
    return groupChat.getId();
  }

  @GetMapping("/getGroups")
  public Iterable<GroupChat> getGroups(Iterable<Long> ids) { return  groupService.getGroupsFromUser(ids); }

  @GetMapping("/getAllGroups")
  public Iterable<GroupChat> getAllGroups() { return groupService.getAllGroups(); }
}
