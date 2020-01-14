package modules.Models;

import java.util.ArrayList;
import java.util.List;

public class Group extends Chat {
  private String name;
  private List<User> users;

  private Group(){}

  public static class Builder{
    private List<User> initialUsers;
    private String name;

    public Builder setInitialUsers(List<User> initialUsers){
      this.initialUsers = new ArrayList<User>(initialUsers);
      return this;
    }

    public Builder setName(String name){
      this.name = name;
      return this;
    }

    public Group build(){
      Group group = new Group();
      group.users = new ArrayList<User>(initialUsers);
      group.name = name;
      return group;
    }
  }
}
