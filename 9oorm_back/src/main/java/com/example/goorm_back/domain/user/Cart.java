package com.example.goorm_back.domain.user;

import com.example.goorm_back.domain.clazz.Clazz;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Cart {

    @Id @GeneratedValue
    @Column(name = "cart_id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "cart_id" )
    private List<Clazz> clazzes = new ArrayList<>();

}
