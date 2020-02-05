package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Group extends Chat {
  private String name;
  @Column(name = "User")
  @ElementCollection(targetClass = User.class)
  private List<User> users;

  protected Group(){}

  private Group(String name, List<User> users){
    this.name = name;
    this.users = users;
  }

  public String getName() {
    return name;
  }

  @OneToMany
  @JoinColumn(name = "USER_ID")
  public List<User> getUsers() {
    return users;
  }

  public static Builder builder(){
    return new Builder();
  }

  public static class Builder{
    private List<User> initialUsers;
    private String name;

    public Builder setInitialUsers(List<User> initialUsers){
      this.initialUsers = initialUsers;
      return this;
    }

    public Builder setName(String name){
      this.name = name;
      return this;
    }

    public Group build(){
      return new Group(name, initialUsers);
    }
  }
}
