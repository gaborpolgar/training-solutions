package references.parameters;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public void connect(String name, String anotherName) {
        findByName(name).connectMember(findByName(anotherName));
    }

    @Override
    public String toString() {
        return members.toString();
    }

    public List<String> bidirectionalConnections() {
        List <String> connections = new ArrayList<>();
        for (Member member: members) {
            for (Member connectedMember: member.getConnections()) {
                if(connectedMember.getConnections().contains(member)){
                    connections.add(member.getName() + " - " + connectedMember.getName());
                }
            }
        }
        return connections;
    }

    public Member findByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
