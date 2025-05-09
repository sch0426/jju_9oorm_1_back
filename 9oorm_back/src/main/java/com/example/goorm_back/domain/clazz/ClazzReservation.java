package com.example.goorm_back.domain.clazz;

import com.example.goorm_back.domain.user.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ClazzReservation {

    @Id @GeneratedValue
    @Column(name = "clazz_reservation_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "clazz_id")
    private Clazz clazz;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @CreationTimestamp
    private LocalDateTime reservationTime;


}
