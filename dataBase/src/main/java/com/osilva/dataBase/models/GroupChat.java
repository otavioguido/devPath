package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class GroupChat extends Chat {
  private String name;
  @ElementCollection(targetClass = String.class)
  @CollectionTable(name = "group_users", joinColumns = @JoinColumn(name = "chat_id"))
  private Set<String> users = new HashSet<String>();

  public GroupChat(String name, Set<String> users) {
    this.name = name;
    this.users = users;
  }

  public GroupChat() {
  }

  public String getName() {
    return name;
  }

  public Set<String> getUsers() {
    return users;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsers(Set<String> users) {
    this.users = users;
  }
}
