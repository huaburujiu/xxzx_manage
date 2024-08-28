package com.xxzx.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxzx.manage.entity.Member;
import com.xxzx.manage.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    @Override
    public Iterable<Member> listAllMember() {

        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(Integer id) {
        return memberRepository.findById(id).get();
    }

}
