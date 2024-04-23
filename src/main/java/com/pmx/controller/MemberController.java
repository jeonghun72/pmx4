package com.pmx.controller;


import com.pmx.dto.MemberDTO;
import com.pmx.entity.Member;
import com.pmx.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value ="admin/member")
public class MemberController {

    private final MemberService memberService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping(value = "/new")
    public String memberForm(Model model){

       model.addAttribute("memberDto",new MemberDTO());
       return "admin/member/memberForm";
    }

    @PostMapping(value = "/reg")
    public String newMember(@Valid MemberDTO memberDto , BindingResult bindingResult , Model model) {

        //if(bindingResult.hasErrors()){ // 에러가 있다면 다시 회원가입 페이지로 이동
           // model.addAttribute("memberDto",memberDto);
            //model.addAttribute("errors", bindingResult.hasErrors());

         //   return "admin/member/member";
       // }

        try {
            Member member = Member.createMember(memberDto , passwordEncoder);
            memberService.saveMember(member);

        } catch(IllegalStateException e) {
            System.out.println(e.toString());
            model.addAttribute("memberDto",memberDto);
            return "admin/member/member";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "redirect:/admin";
        }

        return "redirect:/admin";
    }

    @RequestMapping(value = "/list")
    public String listMember(MemberDTO memberDto,Model model){
        try {
            Member member = Member.createMember(memberDto );
            List<Member> memberList = memberService.listMember(member);
            System.out.println("memberList"+memberList);

            log.debug("bbb");
            log.info("aaaa");
            model.addAttribute("memberList" , memberList );


        } catch(IllegalStateException e) {
            model.addAttribute("errorMessage", e.getMessage());
            return "/admin";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "/admin";
        }

        return "/admin/member/memberList";
    }


    @GetMapping(value = "/login")
    public String loginMember(Model model){
        model.addAttribute("data","안녕하세요");
        return "admin/member/memberLogin";
    }

    @GetMapping(value="/login/error")
    public String loginError(Model model){
        model.addAttribute("loginErrorMsg", "아이디 또는 비밀번호를 확인해주세요");
        return "admin/member/memberLogin";
    }

}
