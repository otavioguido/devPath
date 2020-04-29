package com.osilva.repository;

import com.osilva.model.GroupChat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GroupChatRepository extends JpaRepository<GroupChat, UUID> {
}
