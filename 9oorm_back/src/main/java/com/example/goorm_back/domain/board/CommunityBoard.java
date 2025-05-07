package com.example.goorm_back.domain.board;

import com.example.goorm_back.domain.user.Member;
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

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "communityBoard", orphanRemoval = true)
    private List<BoardComment> comments;


}

/***
 *  하나의 커뮤니티보드에
 *  여러개의 댓글이 있는데 소유가 유저가 한명씩있는거죠
 *  원투원으로 유저하고 댓글하고 묶어놓으면
 *  그 해당 게시물의 댓글을 유저기준으로 쿼리를치면 리스트로 유저의 댓글목록이 나오지않을까요
 *
 */

