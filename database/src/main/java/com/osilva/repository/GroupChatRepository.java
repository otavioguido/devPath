package com.osilva.repository;

import com.osilva.model.GroupChat;
import com.osilva.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GroupChatRepository extends JpaRepository<GroupChat, UUID> {

  Page<GroupChat> findByUsers(User user);

  Page<GroupChat> findByName(String name);
}
