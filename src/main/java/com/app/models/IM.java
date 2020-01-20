package com.app.models;


import java.util.ArrayList;

public class IM extends Chat {
  private final ArrayList<User> users = new ArrayList<User>(2);

  private IM(){}

  public ArrayList<User> getUsers() {
    return users;
  }

  public static class Builder{
    private User user1;
    private User user2;
    private Message message;

    public Builder setUsers(User user1, User user2){
      this.user1 = user1;
      this.user2 = user2;
      return this;
    }

    public Builder setMessage(Message message){
      this.message = message;
      return this;
    }

    public IM build(){
      IM im = new IM();
      im.users.add(user1);
      im.users.add(user2);
      im.messages.add(message);
      return im;
    }
  }
}
