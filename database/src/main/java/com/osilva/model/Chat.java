package com.osilva.model;

import java.util.Set;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public abstract class Chat {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  @OneToMany
  protected Set<Message> messageSet;

  public UUID getId() {
    return id;
  }
}
