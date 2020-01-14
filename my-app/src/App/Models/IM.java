package src.App.Models;

import java.util.ArrayList;

public class IM extends Chat {
  private final ArrayList<User> users = new ArrayList<>(2);

  private IM(){}

  public static class Builder{
    private User user1;
    private User user2;

    public Builder setUsers(User user1, User user2){
      this.user1 = user1;
      this.user2 = user2;
      return this;
    }

    public IM build(){
      IM im = new IM();
      im.users.add(user1);
      im.users.add(user2);
      return im;
    }
  }
}
