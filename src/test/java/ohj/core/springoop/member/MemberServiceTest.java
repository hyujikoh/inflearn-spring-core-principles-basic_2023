package ohj.core.springoop.member;

import ohj.core.springoop.domain.member.entity.Grade;
import ohj.core.springoop.domain.member.entity.Member;
import ohj.core.springoop.domain.member.service.MemberService;
import ohj.core.springoop.domain.member.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc :
 */
public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    @DisplayName("hashmap 을 통한 회원가입 로직")
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);


        //when
        memberService.join(member);

        Member findMember = memberService.findById(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
