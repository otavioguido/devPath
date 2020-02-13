package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GroupChat extends Chat {
  private String name;
  @ManyToMany(cascade = CascadeType.ALL)
  private List<User> users = new ArrayList<User>();

  public GroupChat(String name, List<User> users) {
    this.name = name;
    this.users = users;
  }

  public GroupChat() {
  }

  public String getName() {
    return name;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
