package com.gold.teammanage.controller;


import com.gold.teammanage.entity.Member;
import com.gold.teammanage.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 멤버 정보 모두 불러오기
    @GetMapping("/member/list")
    public String memberList(Model model) {
        model.addAttribute("list", memberService.memberList());
        return "memberlist";
    }
}
