package com.example.goorm_back.domain.board;

import com.example.goorm_back.domain.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class BoardComment {
    @Id @GeneratedValue
    @Column(name = "board_comment_id")
    private long id;

    private User user;

    private String content;

    @CreationTimestamp
    private LocalDateTime createTime;
}
