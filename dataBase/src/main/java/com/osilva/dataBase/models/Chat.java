package com.osilva.dataBase.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
public abstract class Chat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @ElementCollection(targetClass = String.class)
  @CollectionTable(name = "chat_msgs", joinColumns = @JoinColumn(name = "chat_id"))
  protected Set<String> messages = new HashSet<String>();

  public Chat() {
  }

  public Set<String> getMessages() {
    return this.messages;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setMessages(Set<String> messages) {
    this.messages = messages;
  }
}
