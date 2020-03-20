package com.osilva.dataBase.repositories;

import com.osilva.dataBase.models.GroupChat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupChat, Long> {
}
