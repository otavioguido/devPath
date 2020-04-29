package com.osilva.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  private String content;

  public void setContent(String content) {
    this.content = content;
  }

  public UUID getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
