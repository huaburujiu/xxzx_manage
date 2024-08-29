package com.xxzx.manage.service;

import java.util.Collection;

import com.xxzx.manage.entity.Member;

public interface MemberService {
    Iterable<Member> listAllMember();

    Iterable<Member> selectMemberLikeName(String nameLike);

    Iterable<Member> selectMemberByIds(Collection<Integer> ids);

    Member getMemberById(Integer id);
}
