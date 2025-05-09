package com.example.goorm_back.repository;

import com.example.goorm_back.domain.user.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByUserName(String username);
}
