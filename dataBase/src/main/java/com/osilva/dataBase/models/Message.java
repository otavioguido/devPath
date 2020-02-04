package com.osilva.dataBase.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Message {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String content;

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  private Message() {
  }

  public static class Builder{
    private String content;

    public Builder setContent(String content){
      this.content = content;
      return this;
    }

    public Message build(){
      Message message = new Message();
      message.content = content;
      return message;
    }
  }
}
