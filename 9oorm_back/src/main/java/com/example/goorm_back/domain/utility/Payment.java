package com.example.goorm_back.domain.utility;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue
    @Column(name = "payment_id")
    private Long id;

    private String cardName; //사용카드 이름

    private Long money; //결제수단 대체

}
