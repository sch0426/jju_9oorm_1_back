package com.example.goorm_back.domain.board;

import com.example.goorm_back.domain.user.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 *  커뮤니티보드 댓글
 */

@Entity
@Getter
@Setter
public class BoardComment {
    @Id @GeneratedValue
    @Column(name = "board_comment_id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "community_board_id")
    private CommunityBoard communityBoard;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    private String content;

    @CreationTimestamp
    private LocalDateTime createTime;
}


