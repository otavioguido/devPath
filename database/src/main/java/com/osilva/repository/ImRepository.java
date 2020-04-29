package com.osilva.repository;

import com.osilva.model.Im;
import com.osilva.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImRepository extends JpaRepository<Im, UUID> {

  Im findByUsers(User user);

  Im findByUsersAndUsers(User user, User contact);
}
