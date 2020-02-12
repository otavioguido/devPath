package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(unique = true)
  private String login;
  private String password;
  private String name;
  @ManyToMany(cascade = CascadeType.ALL)
  private List<Long> ims = new ArrayList<Long>();
  @ManyToMany(cascade = CascadeType.ALL)
  private List<Long> groupChats = new ArrayList<Long>();

  public User(String login, String password, String name) {
    this.login = login;
    this.password = password;
    this.name = name;
  }

  public User(){}

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

  public List<Long> getIms() {
    return ims;
  }

  public List<Long> getGroupChats() {
    return groupChats;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setIms(List<Long> ims) {
    this.ims = ims;
  }

  public void setGroupChats(List<Long> groupChats) {
    this.groupChats = groupChats;
  }
}
