package com.osilva.repository;

import com.osilva.model.Im;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImRepository extends JpaRepository<Im, UUID> {
}
