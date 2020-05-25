package com.osilva.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class GroupChat extends Chat{

  @Column(nullable = false)
  private String name;
  @ManyToMany(mappedBy = "groupChats")
  @Column(nullable = false)
  private Set<User> users;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }

  @Override
  public String toString() {
    return "GroupChat{" +
        "name='" + name + '\'' +
        ", users=" + users +
        ", id=" + id +
        '}';
  }
}
