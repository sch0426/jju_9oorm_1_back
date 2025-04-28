package com.example.goorm_back.domain.user;

import com.example.goorm_back.domain.clazz.Clazz;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Cart {

    @Id @GeneratedValue
    @Column(name = "cart_id")
    private Long id;

    private List<Clazz> clazzes;
}
