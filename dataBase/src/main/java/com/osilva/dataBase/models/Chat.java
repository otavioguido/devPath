package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class Chat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "Message")
  @ElementCollection(targetClass = Message.class)
  protected List<Message> messages = new ArrayList<Message>();

  public List<Message> getMessages() {
    return this.messages;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }
}
