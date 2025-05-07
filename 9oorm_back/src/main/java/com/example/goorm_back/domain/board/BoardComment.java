package com.example.goorm_back.domain.board;

import com.example.goorm_back.domain.user.User;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 *  커뮤니티보드 댓글
 */

@Entity
public class BoardComment {
    @Id @GeneratedValue
    @Column(name = "board_comment_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "community_board_id")
    private CommunityBoard communityBoard;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;

    @CreationTimestamp
    private LocalDateTime createTime;
}


