package com.xxzx.manage.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxzx.manage.entity.Member;
import com.xxzx.manage.service.MemberService;

@RestController()
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * List all Member.
     *
     */
    @GetMapping("/list")
    public List<Member> list() {
        List<Member> memberList = (List<Member>) memberService.listAllMember();
        return memberList;
    }
}
