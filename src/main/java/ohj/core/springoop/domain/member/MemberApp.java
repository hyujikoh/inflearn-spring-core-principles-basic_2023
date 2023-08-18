package ohj.core.springoop.domain.member;

import ohj.core.springoop.domain.member.service.MemberService;
import ohj.core.springoop.domain.member.service.MemberServiceImpl;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc :
 */
public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        memberService.join(memberA);

        Member findMember = memberService.findById(1L);
        System.out.println("new Member = " + memberA.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
