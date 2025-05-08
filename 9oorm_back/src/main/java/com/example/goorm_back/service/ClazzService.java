package com.example.goorm_back.service;

import com.example.goorm_back.domain.clazz.Clazz;
import com.example.goorm_back.domain.clazz.ClazzReservation;
import com.example.goorm_back.domain.clazz.ReservationStatus;
import com.example.goorm_back.domain.user.Member;
import com.example.goorm_back.repository.ClazzRepository;
import com.example.goorm_back.repository.ClazzReservationRepository;
import com.example.goorm_back.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClazzService {

    private final ClazzRepository clazzRepository;
    private final MemberRepository memberRepository;
    private final ClazzReservationRepository reservationRepository;

    public void saveClazz(Clazz clazz) {
         clazzRepository.save(clazz);
    }

    public void makeClazzReservation(Clazz clazz, Member member) {
        if (clazz.getReservationStatus().equals(ReservationStatus.ING)) {
            ClazzReservation clazzReservation = new ClazzReservation();
            clazzReservation.setClazz(clazz);
            clazzReservation.setMember(member);
            reservationRepository.save(clazzReservation);
        }
    }



}
