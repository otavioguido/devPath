package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(unique = true)
  private String login;
  private String password;
  private String name;
  @ElementCollection(targetClass = String.class)
  @CollectionTable(name = "user_ims", joinColumns = @JoinColumn(name = "user_id"))
  private Set<String> ims;
  @ElementCollection(targetClass = String.class)
  @CollectionTable(name = "user_groups", joinColumns = @JoinColumn(name = "user_id"))
  private Set<String> groupChats;

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

  public Set<String> getIms() {
    return ims;
  }

  public Set<String> getGroupChats() {
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

  public void setIms(Set<String> ims) {
    this.ims = ims;
  }

  public void setGroupChats(Set<String> groupChats) {
    this.groupChats = groupChats;
  }
}
