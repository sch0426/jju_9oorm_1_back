package com.example.goorm_back.domain.clazz;

import com.example.goorm_back.domain.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class ReviewBoard {

    @Id
    @GeneratedValue
    @Column(name = "notice_board")
    private Long id;

    private Long rating; // 평점 받아서 Clazz 쪽으로 넘김

    private String reviewBoardTitle; //제목

    private String reviewImage;  //리뷰이미지

    @Lob
    private String contents; //내용

    private User user;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
