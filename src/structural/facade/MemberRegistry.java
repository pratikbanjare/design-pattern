package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class MemberRegistry {

    private List<Member> members;

    public MemberRegistry(){
        members = new ArrayList<>();

    }

    public void addAllMembers(List<Member> members){
        this.members.addAll(members);
    }

    public Member findMemberByName(String name){
        return members.stream()
                .filter(member -> name.equalsIgnoreCase(member.getName()))
                .findFirst()
                .orElse(null);
    }

    public List<Member> getMembers() {
        return members;
    }

    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder();
        for (Member member : members){
            builder.append("\t").append(member.toString()).append("\n");
        }
        return builder.toString();
    }
}
