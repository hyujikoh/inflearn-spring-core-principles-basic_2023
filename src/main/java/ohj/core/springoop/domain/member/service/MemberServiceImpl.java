package ohj.core.springoop.domain.member.service;

import ohj.core.springoop.domain.member.entity.Member;
import ohj.core.springoop.domain.member.repository.MemberRepository;
import ohj.core.springoop.domain.member.repository.MemoryMemberRepository;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-17
 * Desc :
 */
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
