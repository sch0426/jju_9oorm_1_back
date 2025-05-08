package com.example.goorm_back.repository;

import com.example.goorm_back.domain.clazz.ClazzReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzReservationRepository extends JpaRepository<ClazzReservation, Long> {
}
