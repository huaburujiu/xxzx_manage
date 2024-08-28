package com.xxzx.manage.service;

import com.xxzx.manage.entity.Member;


public interface MemberService {
    Iterable<Member> listAllMember();

    Member getMemberById(Integer id);
}
