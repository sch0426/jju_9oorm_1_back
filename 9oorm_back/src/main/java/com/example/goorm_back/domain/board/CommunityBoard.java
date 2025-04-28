package com.example.goorm_back.domain.board;

import com.example.goorm_back.domain.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class CommunityBoard {

    @Id @GeneratedValue
    @Column(name = "community_board_id")
    private Long id;

    private String boardTitle; //제목

    @Lob
    private String contents; //내용

    private User user;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private List<BoardComment> comments;


}
