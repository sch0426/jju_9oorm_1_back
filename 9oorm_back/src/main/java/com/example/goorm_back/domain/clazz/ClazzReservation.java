package com.example.goorm_back.domain.clazz;

import com.example.goorm_back.domain.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class ClazzReservation {

    @Id @GeneratedValue
    @Column(name = "clazz_reservation_id")
    private Long id;

    private Clazz clazz;

    private User user;

    @CreationTimestamp
    private LocalDateTime reservationTime;

    private ReservationStatus reservationStatus;
}
