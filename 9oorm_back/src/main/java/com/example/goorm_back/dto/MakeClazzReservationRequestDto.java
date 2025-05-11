package com.example.goorm_back.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MakeClazzReservationRequestDto {
    private Long clazzId;
    private Long memberId;
    private LocalDateTime reservationTime; // 예약한 시간
    private String reservationDate; // 예약 클래스 시작 날짜
    private String reservationInviteTime; // 예약 클래스 시작 시간
    private int peopleCount; // 인원 수
}
