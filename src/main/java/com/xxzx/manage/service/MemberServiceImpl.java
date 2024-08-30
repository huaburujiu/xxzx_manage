package com.xxzx.manage.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxzx.manage.entity.Member;
import com.xxzx.manage.repository.MemberRepository;
import com.xxzx.manage.specification.MemberByIdsSpecification;
import com.xxzx.manage.specification.MemberSpecifications;

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

    @Override
    public Iterable<Member> selectMemberLikeName(String nameLike) {
        return memberRepository.findAll(MemberSpecifications.likeName(nameLike));
    }

    @Override
    public Iterable<Member> selectMemberByIds(Collection<Integer> ids) {
        return memberRepository.findAll(new MemberByIdsSpecification(ids));
    }

}
