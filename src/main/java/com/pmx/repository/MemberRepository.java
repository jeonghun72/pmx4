package com.pmx.repository;

import com.pmx.entity.Member;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final SqlSessionTemplate sql;

    public void inserMember(Member member) {
        sql.insert("com.pmx.mapper.Member.insert", member);
    }

    public List<Member> listMember(Member member) {
        return sql.selectList("com.pmx.mapper.Member.list" , member);
    }

     public Member chkMemUserId(Member member) {
         return sql.selectList("com.pxm.mapper.Member.idCheck" , member);

     }

}