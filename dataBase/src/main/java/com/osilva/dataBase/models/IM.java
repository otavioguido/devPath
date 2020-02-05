package com.osilva.dataBase.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class IM extends Chat {
  @Column(name = "User")
  @ElementCollection(targetClass = User.class)
  private List<User> users = new ArrayList<User>(2);

  protected IM(){}

  private IM(List<User> users){
    this.users = users;
  }

  @OneToMany
  @JoinColumn(name = "USER_ID")
  public List<User> getUsers() {
    return users;
  }

  public static Builder builder(){
    return new Builder();
  }

  public static class Builder{
    private List<User> users = new ArrayList<User>(2);

    public Builder setUsers(User user1, User user2){
      this.users.add(user1);
      this.users.add(user2);
      return this;
    }

    public IM build(){
      return new IM(users);
    }
  }
}
