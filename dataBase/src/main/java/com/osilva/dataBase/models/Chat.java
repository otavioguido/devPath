package com.osilva.dataBase.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public abstract class Chat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  protected List<Message> messages = new ArrayList<Message>();

  public List<Message> getMessages() {
    return this.messages;
  }

  public long getId() {
    return id;
  }
}
