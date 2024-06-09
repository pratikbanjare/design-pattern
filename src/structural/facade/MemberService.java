package structural.facade;

import java.util.List;

public class MemberService {

    public MemberService() {

    }

    public void addMember(String name){

    }

    public Member findMemberByName(String name){
        MemberRegistry memberRegistry = Initializer.getMemberRegistry();
        return memberRegistry.findMemberByName(name);
    }

    public List<Member> listAllMembers () {
        return Initializer.getMemberRegistry().getMembers();
    }

}
