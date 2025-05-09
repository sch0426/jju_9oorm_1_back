package com.example.goorm_back.domain.board;

import com.example.goorm_back.domain.user.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class NoticeBoard {

    @Id
    @GeneratedValue
    @Column(name = "notice_board")
    private Long id;

    private String boardTitle; //제목

    @Lob
    private String contents; //내용

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
