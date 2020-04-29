package com.osilva.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class GroupChat extends Chat{

  @Column(nullable = false)
  private String name;
  @ManyToMany(mappedBy = "groupChats")
  private Set<User> users;
}
