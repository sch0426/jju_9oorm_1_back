package com.example.goorm_back.repository;

import com.example.goorm_back.domain.clazz.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClazzRepository extends JpaRepository<Clazz, Long> {
}
