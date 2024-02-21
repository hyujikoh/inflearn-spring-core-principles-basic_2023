package ohj.core.springoop.member.service;

import ohj.core.springoop.member.Member;
import ohj.core.springoop.member.respository.MemberRepository;
import ohj.core.springoop.member.respository.MemoryMemberRepository;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
