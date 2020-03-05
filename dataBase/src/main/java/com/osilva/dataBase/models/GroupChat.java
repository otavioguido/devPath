package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GroupChat extends Chat {
  private String name;
  @ElementCollection(targetClass = Long.class)
  private List<Long> users = new ArrayList<Long>();

  public GroupChat(String name, List<Long> users) {
    this.name = name;
    this.users = users;
  }

  public GroupChat() {
  }

  public String getName() {
    return name;
  }

  public List<Long> getUsers() {
    return users;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsers(List<Long> users) {
    this.users = users;
  }
}
