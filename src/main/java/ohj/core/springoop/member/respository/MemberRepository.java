package ohj.core.springoop.member.respository;

import ohj.core.springoop.member.Member;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
