package com.app.models;

import java.util.UUID;

public class Message {
  private final String id = UUID.randomUUID().toString();
  private String content;

  public String getId() {
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