package com.example.goorm_back.service;

import com.example.goorm_back.domain.clazz.Clazz;
import com.example.goorm_back.domain.clazz.ClazzReservation;
import com.example.goorm_back.domain.clazz.ReservationStatus;
import com.example.goorm_back.domain.user.Member;
import com.example.goorm_back.dto.MakeClazzReservationRequestDto;
import com.example.goorm_back.dto.SaveClazzRequestDto;
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

    public void saveClazz(SaveClazzRequestDto saveClazzRequestDto) {
        Clazz clazz = new Clazz();
        clazz.setClazzTitle(saveClazzRequestDto.getClazzTitle());
        clazz.setClazzDescription(saveClazzRequestDto.getClazzDescription());
        clazz.setClazzPrice(saveClazzRequestDto.getClazzPrice());
        clazz.setClazzProfileImage(saveClazzRequestDto.getClazzProfileImage());
        clazz.setLatitude(saveClazzRequestDto.getLatitude());
        clazz.setLongitude(saveClazzRequestDto.getLongitude());
        clazz.setCategory(saveClazzRequestDto.getCategory());

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

    public void makeClazzReservation(MakeClazzReservationRequestDto makeClazzReservationRequestDto) {
        Clazz findClazz = clazzRepository.findById(makeClazzReservationRequestDto.getClazzId())
                .orElseThrow(() -> new IllegalArgumentException("해당 클래스가 존재하지 않습니다"));
        Member findMember = memberRepository.findById(makeClazzReservationRequestDto.getMemberId())
                .orElseThrow(() -> new IllegalArgumentException("해당 멤버가 존재하지 않습니다"));

        ClazzReservation clazzReservation = new ClazzReservation();
        clazzReservation.setClazz(findClazz);
        clazzReservation.setMember(findMember);
        clazzReservation.setReservationTime(makeClazzReservationRequestDto.getReservationTime());
        clazzReservation.setReservationDate(makeClazzReservationRequestDto.getReservationDate());
        clazzReservation.setReservationInviteTime(makeClazzReservationRequestDto.getReservationInviteTime());
        clazzReservation.setPeopleCount(makeClazzReservationRequestDto.getPeopleCount());
        reservationRepository.save(clazzReservation);
    }



}
