package com.osilva.dataBase.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class IM extends Chat {
  @ManyToMany(cascade = CascadeType.ALL)
  private List<Long> users = new ArrayList<Long>(2);

  public IM(List<Long> users) {
    this.users = users;
  }

  public IM() {
  }

  public List<Long> getUsers() {
    return users;
  }

  public void setUsers(List<Long> users) {
    this.users = users;
  }
}
