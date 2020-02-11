package com.osilva.dataBase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String content;

  public Message(String content) {
    this.content = content;
  }

  public Message() {
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
