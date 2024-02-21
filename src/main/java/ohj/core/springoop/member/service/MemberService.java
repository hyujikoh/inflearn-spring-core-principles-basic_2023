package ohj.core.springoop.member.service;

import ohj.core.springoop.member.Member;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
