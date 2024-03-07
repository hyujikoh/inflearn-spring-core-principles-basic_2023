package ohj.core.springoop.member.service;

import ohj.core.springoop.member.Member;
import ohj.core.springoop.member.respository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
@Component
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
