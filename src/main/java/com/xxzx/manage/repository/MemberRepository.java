package com.xxzx.manage.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.xxzx.manage.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{
    
}
