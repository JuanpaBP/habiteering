package com.poringhabits.model.repository;

import com.poringhabits.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EggRepository extends JpaRepository<UserEntity, Long> {
}
