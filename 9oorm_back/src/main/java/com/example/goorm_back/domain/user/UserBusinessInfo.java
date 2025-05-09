package com.example.goorm_back.domain.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserBusinessInfo {

    @Id
    @GeneratedValue
    @Column(name = "user_business_info_id")
    private Long id;

    //알아보고적읍시다.
}
