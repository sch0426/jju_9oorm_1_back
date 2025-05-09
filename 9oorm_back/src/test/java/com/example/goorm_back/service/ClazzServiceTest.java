package com.example.goorm_back.service;

import com.example.goorm_back.domain.clazz.Clazz;
import com.example.goorm_back.domain.clazz.ClazzReservation;
import com.example.goorm_back.domain.clazz.ReservationStatus;
import com.example.goorm_back.domain.user.Member;
import com.example.goorm_back.repository.ClazzRepository;
import com.example.goorm_back.repository.ClazzReservationRepository;
import com.example.goorm_back.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ClazzServiceTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ClazzRepository ClazzRepository;

    @Autowired
    private ClazzService clazzService;

    @Autowired
    private ClazzReservationRepository reservationRepository;

    @Test
    @BeforeEach
    void setUp() {
        Clazz clazz = new Clazz();
        clazz.setClazzTitle("바느질");
        clazz.setClazzPrice(10000L);
        clazz.setReservationStatus(ReservationStatus.ING);
        clazzService.saveClazz(clazz);

        Member member = new Member();
        member.setNickname("tester");
        member.setUserName("testerRealName");
        member.setPassword("1234");
        memberRepository.save(member);

    }

    @Test
    @DisplayName("클래스 저장하기")
    void saveClazz() {
        List<Clazz> clazzes = ClazzRepository.findAll();
        assertThat(clazzes).isNotEmpty();
        assertThat(clazzes.size()).isEqualTo(1);
        assertThat(clazzes.stream().findFirst().get().getClazzTitle()).isEqualTo("바느질");
        assertThat(clazzes.stream().findFirst().get().getClazzPrice()).isEqualTo(10000L);
        assertThat(clazzes.stream().findFirst().get().getReservationStatus()).isEqualTo(ReservationStatus.ING);
    }

    @Test
    @DisplayName("클래스 예약 생성하기")
    void makeClazzReservation() {
        List<Clazz> clazzes = ClazzRepository.findAll();
        Clazz findClazz = clazzes.stream().findFirst().get();
        Member findMember = memberRepository.findByUserName("testerRealName");
        clazzService.makeClazzReservation(findClazz, findMember);

        List<ClazzReservation> reservations = reservationRepository.findAll();
        ClazzReservation clazzReservation = reservations.stream().findFirst().get();

        assertThat(clazzReservation.getMember()).isEqualTo(findMember);
        assertThat(clazzReservation.getClazz()).isEqualTo(findClazz);
        assertThat(clazzReservation.getClazz().getReservationStatus()).isEqualTo(ReservationStatus.ING);



    }
}