package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class Chat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @ElementCollection(targetClass = Long.class)
  protected List<Long> messages = new ArrayList<Long>();

  public Chat() {
  }

  public List<Long> getMessages() {
    return this.messages;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setMessages(List<Long> messages) {
    this.messages = messages;
  }
}
