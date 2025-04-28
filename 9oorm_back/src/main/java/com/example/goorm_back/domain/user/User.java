package com.example.goorm_back.domain.user;

import com.example.goorm_back.domain.utility.Payment;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private GenderType gender; //성별

    private String phoneNumber;

    private String userName;


    private String password;

    private String email;

    private String profileImage; //프로필 이미지

    @Enumerated(EnumType.STRING)
    private Role role; //일반 사용자 와 사업자 구분

    private String address; // 거주지 주소

    @Column(unique = true)
    private String nickname;

    private Payment payment; //결제정보

    private Cart cart;

    private Bookmark bookmark;





}
