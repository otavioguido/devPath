package com.osilva.dataBase.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String login;
  private String password;
  private String name;
  private List<IM> ims = new ArrayList<IM>();
  private List<Group> groups = new ArrayList<Group>();

  private User() {}

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<IM> getIms() {
    return ims;
  }

  public List<Group> getGroups() {
    return groups;
  }

  public static class Builder{
    private String name;

    public Builder setName(String name){
      this.name = name;
      return this;
    }

    public User build(){
      User user = new User();
      user.name = name;
      return user;
    }
  }
}
