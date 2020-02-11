package com.osilva.dataBase.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class IM extends Chat {
  @ManyToMany(mappedBy = "ims")
  private List<User> users = new ArrayList<User>(2);

  public IM(List<User> users) {
    this.users = users;
  }

  public IM() {
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
