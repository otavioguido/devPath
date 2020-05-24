package com.osilva.repository;

import static org.junit.Assert.assertTrue;

import com.osilva.model.GroupChat;
import com.osilva.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class GroupChatRepositoryTest {
  @Autowired
  private TestEntityManager testEntityManager;

  @Autowired
  private GroupChatRepository repository;

  @Test
  public void findGroupByName(){
    // given
    User user1 = new User("user1");
    User user2 = new User("user2");
    User user3 = new User("user3");
    GroupChat groupChat = new GroupChat();
    groupChat.setName("groupName");
    groupChat.setUsers(new HashSet<>(Arrays.asList(user1, user2, user3)));
    testEntityManager.persist(groupChat);
    testEntityManager.flush();

    // when
    List<GroupChat> found = repository.findByName(groupChat.getName());

    // then
    assertTrue(found.stream().anyMatch(groupChat1 -> groupChat1.equals(groupChat)));
  }
}
