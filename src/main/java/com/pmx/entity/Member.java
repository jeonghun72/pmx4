package com.pmx.entity;

import com.pmx.dto.MemberDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;


@Getter @Setter
@ToString
public class Member extends BaseEntity {

    private Long memId;

    private String memType;

    private String memUserId;

    private String memUserPw;

    private String memNm;

    private String memSex;

    private String memBirth;

    private String memEmail;

    private String memTel1;

    private String memTel2;

    private String memTel3;

    private String memZip;

    private String memAddr;


    public static Member createMember(MemberDTO memberDto , PasswordEncoder passwordEncoder){
        Member member = new Member();
        member.setMemType(memberDto.getMemType());
        member.setMemNm(memberDto.getMemNm());
        member.setMemSex(memberDto.getMemSex());
        member.setMemBirth(memberDto.getMemBirth1()+memberDto.getMemBirth2()+memberDto.getMemBirth3());
        member.setMemTel1(memberDto.getMemTel1());
        member.setMemTel2(memberDto.getMemTel2());
        member.setMemTel3(memberDto.getMemTel3());
        member.setMemEmail(memberDto.getMemEmail());
        member.setMemZip(memberDto.getMemZip());
        member.setMemAddr(memberDto.getMemAddr());
        member.setMemUserId(memberDto.getMemUserId());
        member.setMemUserPw(passwordEncoder.encode(memberDto.getMemUserPw()));
        return member;
    }
    public static Member createMember(MemberDTO memberDto){
        Member member = new Member();
        member.setMemType(memberDto.getMemType());
        member.setMemNm(memberDto.getMemNm());
        member.setMemSex(memberDto.getMemSex());
        member.setMemBirth(memberDto.getMemBirth1()+memberDto.getMemBirth2()+memberDto.getMemBirth3());
        member.setMemTel1(memberDto.getMemTel1());
        member.setMemTel2(memberDto.getMemTel2());
        member.setMemTel3(memberDto.getMemTel3());
        member.setMemEmail(memberDto.getMemEmail());
        member.setMemZip(memberDto.getMemZip());
        member.setMemAddr(memberDto.getMemAddr());
        member.setMemUserId(memberDto.getMemUserId());
        return member;
    }

}