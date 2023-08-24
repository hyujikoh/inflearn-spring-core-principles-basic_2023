package ohj.core.springoop.domain.member.repository;

import ohj.core.springoop.domain.member.entity.Member;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-17
 * Desc : 단순한 메모리 형태 리포지터리 구현체
 */

@Component
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(),member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
