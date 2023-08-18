package ohj.core.springoop.domain.member.repository;

import ohj.core.springoop.domain.member.entity.Member;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-17
 * Desc :
 */
public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
