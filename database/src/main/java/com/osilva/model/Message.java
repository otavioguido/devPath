package com.osilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Message extends AbstractEntity{

  @Column(nullable = false, updatable = false)
  private String content;

  public void setContent(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
