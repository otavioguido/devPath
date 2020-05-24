package com.osilva.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.osilva.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
  @Autowired
  private TestEntityManager testEntityManager;

  @Autowired
  private UserRepository userRepository;

  @Test
  public void findUserByName(){
    // given
    User user = new User("user");
    testEntityManager.persist(user);
    testEntityManager.flush();

    // when
    User found = userRepository.findByName(user.getName());

    // then
    assertThat(found).isEqualTo(user);
  }
}
