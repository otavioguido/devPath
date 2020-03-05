package com.app;

import com.app.utils.UserActionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserActionServiceTest {

    /*@Test
    public void sendMessageInIM(){
        User sender = new User.Builder().setName("sender").build();
        User receiver = new User.Builder().setName("receiver").build();
        Message message = new Message.Builder().setContent("unit test message").build();
        UserActionService userActionService = new UserActionService();

        userActionService.sendMessageToIM(message, sender, receiver);
    }

    @Test
    public void createGroupTest(){
        User user1 = new User.Builder().setName("user1").build();
        User user2 = new User.Builder().setName("user2").build();
        List<User> userList = new ArrayList<User>(Arrays.asList(user1, user2));
        UserActionService userActionService = new UserActionService();

        userActionService.createGroup(userList, "unit test group name");
    }

    @Test
    public void sendMessageToGroupTest() throws Exception {
        User user1 = new User.Builder().setName("user1").build();
        User user2 = new User.Builder().setName("user2").build();
        List<User> userList = new ArrayList<User>(Arrays.asList(user1, user2));
        Message message = new Message.Builder().setContent("unit test message").build();
        UserActionService userActionService = new UserActionService();

        Group group = userActionService.createGroup(userList, "unit test group name");
        userActionService.sendMessageToGroup(message, user1, group);
    }

    @Test
    public void sendMessageToNonExistentGroup() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            User user1 = new User.Builder().setName("user1").build();
            User user2 = new User.Builder().setName("user2").build();
            List<User> userList = new ArrayList<User>(Arrays.asList(user1, user2));
            Message message = new Message.Builder().setContent("unit test message").build();
            UserActionService userActionService = new UserActionService();

            Group group = new Group.Builder().build();
            userActionService.sendMessageToGroup(message, user1, group);
        });
    }*/
}
