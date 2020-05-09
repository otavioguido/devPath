package com.osilva.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class User extends AbstractEntity{

  @Column(nullable = false)
  private String name;
  @ManyToMany(cascade = CascadeType.ALL)
  private Set<Im> ims;
  @ManyToMany(cascade = CascadeType.ALL)
  private Set<GroupChat> groupChats;

  public User(String name) {
    this.name = name;
  }

  public User() {
  }

  public Set<GroupChat> getGroupChats() {
    return groupChats;
  }

  public Set<Im> getIms() {
    return ims;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", ims=" + ims +
        ", groupChats=" + groupChats +
        ", id=" + id +
        '}';
  }
}
