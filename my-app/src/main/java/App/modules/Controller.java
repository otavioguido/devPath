package modules;


import modules.Models.*;

import java.util.List;

public abstract class Controller {
  //private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());

  public void searchUser(String name){

  }

  public void sendMessageToIM(Message message, User sender, User receiver){
    for (IM im : sender.getIms()){
      if (im.getUsers().contains(receiver)){
        im.getMessages().add(message);
        return;
      }
    }

    IM im = new IM.Builder().setUsers(sender, receiver).setMessage(message).build();
    sender.getIms().add(im);
    receiver.getIms().add(im);
    return;
  }

  public void createGroup(User creater, List<User> userList){

  }

  public void sendMessageToGroup(String content, User sender, Group group){

  }

}
