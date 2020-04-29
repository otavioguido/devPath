package com.osilva.model;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  public UUID getId() {
    return id;
  }

  @Override
  public int hashCode() {
    return this.id == null ? 0 : this.id.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o){
      return true;
    }
    if (this.id == null || o == null || !(this.getClass().equals(o.getClass()))){
      return false;
    }

    AbstractEntity that = (AbstractEntity) o;

    return this.id.equals(that.getId());
  }
}
