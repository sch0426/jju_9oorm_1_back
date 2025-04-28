package com.example.goorm_back.domain.board;

import com.example.goorm_back.domain.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class NoticeBoard {

    @Id
    @GeneratedValue
    @Column(name = "notice_board")
    private Long id;

    private String boardTitle; //제목

    @Lob
    private String contents; //내용

    private User user;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
