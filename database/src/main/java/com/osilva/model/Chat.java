package com.osilva.model;

import java.util.Set;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@MappedSuperclass
public abstract class Chat extends AbstractEntity {
  @OneToMany
  protected Set<Message> messageSet;

  public Set<Message> getMessageSet() {
    return messageSet;
  }
}
