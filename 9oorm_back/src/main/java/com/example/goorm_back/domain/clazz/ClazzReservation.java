package com.example.goorm_back.domain.clazz;

import com.example.goorm_back.domain.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class ClazzReservation {

    @Id @GeneratedValue
    @Column(name = "clazz_reservation_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "clazz_id")
    private Clazz clazz;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @CreationTimestamp
    private LocalDateTime reservationTime;

    private ReservationStatus reservationStatus;
}
