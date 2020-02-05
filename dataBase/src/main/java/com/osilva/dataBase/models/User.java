package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String login;
  private String password;
  private String name;
  @Column(name = "IM")
  @ElementCollection(targetClass = IM.class)
  private List<IM> ims = new ArrayList<IM>();
  @Column(name = "Group")
  @ElementCollection(targetClass = Group.class)
  private List<Group> groups = new ArrayList<Group>();

  protected User() {}

  private User(String login, String password, String name){
    this.login = login;
    this.password = password;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  @OneToMany
  @JoinColumn(name = "IM_ID")
  public List<IM> getIms() {
    return ims;
  }

  @OneToMany
  @JoinColumn(name = "GROUP_ID")
  public List<Group> getGroups() {
    return groups;
  }

  public static Builder builder(){
    return new Builder();
  }

  public static class Builder{
    private String name;
    private String login;
    private String password;

    public Builder setName(String name){
      this.name = name;
      return this;
    }

    public Builder setLogin(String login){
      this.login = login;
      return this;
    }

    public Builder setPassword(String password){
      this.password = password;
      return this;
    }

    public User build(){
      return new User(login, password, name);
    }
  }
}
