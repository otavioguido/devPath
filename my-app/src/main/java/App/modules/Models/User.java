package modules.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
  private final String id = UUID.randomUUID().toString();
  private String name;
  private List<IM> ims = new ArrayList<IM>();
  private List<Group> groups = new ArrayList<Group>();

  private User() {}

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<IM> getIms() {
    return ims;
  }

  public List<Group> getGroups() {
    return groups;
  }

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
