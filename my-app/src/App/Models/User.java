package src.App.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
  private final String id = UUID.randomUUID().toString();
  private String name;
  private List<IM> ims = new ArrayList<>();
  private List<Group> groups = new ArrayList<>();

  private User() {}

  public static class Builder{
    private String name;

    public Builder setName(String name){
      this.name = name;
      return this;
    }

    public User build(){
      User user = new User();
      user.name = name;
      return user;
    }
  }
}
