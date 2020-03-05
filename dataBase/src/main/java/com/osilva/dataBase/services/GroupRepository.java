package com.osilva.dataBase.services;

import com.osilva.dataBase.models.GroupChat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<GroupChat, Long> {
}