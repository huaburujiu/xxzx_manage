package com.xxzx.manage.controller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

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

    /**
     * 模糊查询
     * 参数: nameLike
     */
    @GetMapping("/like/name")
    public List<Member> listLikeName(@RequestParam(name = "nameLike", required = true) String nameLike) {
        List<Member> memberList = (List<Member>) memberService.selectMemberLikeName(nameLike);
        return memberList;
    }

    /**
     * 查询
     * 参数: ids[1,2]
     */
    @PostMapping("/ids")
    public List<Member> listByIds(@RequestBody List<Integer> ids) {
        List<Member> memberList = (List<Member>) memberService.selectMemberByIds(ids);
        return memberList;
    }
}
