package ohj.core.springoop.domain.member.service;

import ohj.core.springoop.domain.member.entity.Member;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-17
 * Desc :
 */
public interface MemberService {
    void join(Member member);

    Member findById(Long memberId);
}
