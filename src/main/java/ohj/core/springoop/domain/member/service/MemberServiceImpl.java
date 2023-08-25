package ohj.core.springoop.domain.member.service;

import lombok.RequiredArgsConstructor;
import ohj.core.springoop.domain.member.entity.Member;
import ohj.core.springoop.domain.member.repository.MemberRepository;
import ohj.core.springoop.domain.member.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-17
 * Desc :
 */
@Component
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;// 추상화에 대해서만 의지한다.

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
