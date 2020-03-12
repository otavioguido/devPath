package com.osilva.dataBase.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class IM extends Chat {
  @ElementCollection(targetClass = String.class)
  @CollectionTable(name = "im_users", joinColumns = @JoinColumn(name = "chat_id"))
  private Set<String> users = new HashSet<String>(2);

  public IM(HashSet<String> users) {
    this.users = users;
  }

  public IM() {
  }

  public Set<String> getUsers() {
    return users;
  }

  public void setUsers(Set<String> users) {
    this.users = users;
  }
}
