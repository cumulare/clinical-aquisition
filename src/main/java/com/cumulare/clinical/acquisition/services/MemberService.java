package com.cumulare.clinical.acquisition.services;

import com.cumulare.clinical.acquisition.models.Member;
import lombok.Data;

@Data
public class MemberService implements IMemberService {

    @Override
    public void getMemberDetails() {
        Member member = new Member();
        member.setFirstName("John");
    }

    @Override
    public void getMemberEligibility() {
        // TODO Auto-generated method stub
    }
}
