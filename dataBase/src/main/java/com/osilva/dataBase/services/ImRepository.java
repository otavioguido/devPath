package com.osilva.dataBase.services;

import com.osilva.dataBase.models.IM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImRepository extends CrudRepository<IM, Long> {
}
