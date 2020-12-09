package references.parameters;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private List<Member> connections = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() +
               " connections: ");
        for (int i = 0; i < getConnections().size(); i++){
            sb.append(getConnections().get(i).getName() + ", ");
            }
        return sb.toString();
        }

    public String getName() {
        return name;
    }

    private List<String> connectedNames(){
        List<String> connectedNames = new ArrayList<>();
        for (Member member: connections){
            connectedNames.add(member.getName());
        }
        return connectedNames;
    }

    public List<Member> getConnections(){
        return connections;
    }

    public void connectMember(Member member){
        connections.add(member);
    }

}
