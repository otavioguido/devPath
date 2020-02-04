package com.osilva.dataBase.models;

import java.util.ArrayList;
import java.util.List;

public class Group extends Chat {
  private String name;
  private List<User> users;

  private Group(){}

  public String getName() {
    return name;
  }

  public List<User> getUsers() {
    return users;
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
      Group group = new Group();
      group.users = new ArrayList<User>(initialUsers);
      group.name = name;
      return group;
    }
  }
}
