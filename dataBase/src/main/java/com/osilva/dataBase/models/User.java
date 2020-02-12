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
  @JoinTable(name="users_ims",
          joinColumns = @JoinColumn(name = "im_id"),
          inverseJoinColumns = @JoinColumn(name = "user_id"))
  private List<IM> ims = new ArrayList<IM>();
  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name="users_groups",
          joinColumns = @JoinColumn(name = "group_id"),
          inverseJoinColumns = @JoinColumn(name = "user_id"))
  private List<GroupChat> groupChats = new ArrayList<GroupChat>();

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

  public List<IM> getIms() {
    return ims;
  }

  public List<GroupChat> getGroupChats() {
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

  public void setIms(List<IM> ims) {
    this.ims = ims;
  }

  public void setGroupChats(List<GroupChat> groupChats) {
    this.groupChats = groupChats;
  }

  public void addIM(IM im){
    ims.add(im);
    im.getUsers().add(this);
  }

  public void removeIM(IM im){
    ims.remove(im);
    im.getUsers().remove(this);
  }

  public void addGroup(GroupChat groupChat){
    groupChats.add(groupChat);
    groupChat.getUsers().add(this);
  }

  public void removeGroup(GroupChat groupChat){
    groupChats.remove(groupChat);
    groupChat.getUsers().remove(this);
  }
}
