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

  protected Message() {
  }

  private Message(String content){
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public static Builder builder(){
    return new Builder();
  }

  public static class Builder{
    private String content;

    public Builder setContent(String content){
      this.content = content;
      return this;
    }

    public Message build(){
      return new Message(content);
    }
  }
}
