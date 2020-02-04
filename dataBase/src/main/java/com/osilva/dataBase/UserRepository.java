package com.osilva.dataBase;

import com.osilva.dataBase.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
