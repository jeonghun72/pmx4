package com.pmx.service;

import com.pmx.entity.Member;
import com.pmx.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService  {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member saveMember(Member member){
        //this.validateDuplicateMember(member);
        memberRepository.inserMember(member);
        return member;
    }

    public List<Member> listMember(Member member) {
        List<Member> list = memberRepository.listMember(member);
        return list;
    }
/**
    private void validateDuplicateMember(Member member){
        //Member findMember = memberRepository.findByMem(member.getMemUserId());
        Member findMember = memberRepository.findByMemUserId(member);
        if(findMember != null){
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }

*/


}