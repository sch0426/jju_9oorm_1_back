package com.example.goorm_back.domain.user;

import com.example.goorm_back.domain.clazz.Clazz;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Bookmark {

    @Id @GeneratedValue
    @Column(name = "book_mark_id")
    private Long id;

    @OneToMany
    @JoinColumn(name = "book_mark_id")
    private List<Clazz> clazzes = new ArrayList<>();

}
