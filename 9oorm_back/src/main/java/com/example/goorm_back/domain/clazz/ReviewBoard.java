package com.example.goorm_back.domain.clazz;

import com.example.goorm_back.domain.user.Member;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class ReviewBoard {

    @Id
    @GeneratedValue
    @Column(name = "review_board_id")
    private Long id;

    private Long rating; // 평점 받아서 Clazz 쪽으로 넘김

    private String reviewBoardTitle; //제목

    private String reviewImage;  //리뷰이미지

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clazz_id")
    private Clazz clazz;

    @Lob
    private String contents; //내용

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
