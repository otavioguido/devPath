package com.app.utils;


import com.app.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import static com.app.utils.Constants.*;

public class UserActionService {
  private static final Logger LOGGER = LogManager.getLogger(UserActionService.class);

  public void searchUser(String name){

  }

  public void sendMessageToIM(Message message, User sender, User receiver){
    LOGGER.info(SEND_MESSAGE, sender.getId(), sender.getName(), receiver.getId(), receiver.getName(),
            message.getId(), message.getContent());

    for (IM im : sender.getIms()){
      if (im.getUsers().contains(receiver)){
        im.getMessages().add(message);
        return;
      }
    }

    LOGGER.info(CREATE_IM);
    IM im = new IM.Builder().setUsers(sender, receiver).setMessage(message).build();
    sender.getIms().add(im);
    receiver.getIms().add(im);
    LOGGER.info(MESSAGE_SENT);
    return;
  }

  public Group createGroup(List<User> userList, String groupName){
    LOGGER.info(CREATE_GROUP);
    Group group = new Group.Builder().setInitialUsers(userList).setName(groupName).build();

    for (User user : userList){
      user.getGroups().add(group);
    }

    return group;
  }

  public void sendMessageToGroup(Message message, User sender, Group group) throws Exception {
    LOGGER.info(SEND_MESSAGE, sender.getId(), sender.getName(), group.getId(), group.getName(),
            message.getId(), message.getContent());

    for (Group userGroups : sender.getGroups()){
      if (userGroups.getId().equals(group.getId())){
        userGroups.getMessages().add(message);
        return;
      }
    }
    throw new Exception(GROUP_NOT_FOUND);
  }

}
