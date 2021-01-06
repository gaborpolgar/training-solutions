package exam02.cv;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Cv {

    public static void main(String[] args) {
    }

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... s) {
        int level = 0;
        for (String sk: s)
        {
            String [] parts = sk.split(" ");
            System.out.println(parts.toString());
            if (parts.length == 2) {
                System.out.println(parts[1]);
                level = (int) Integer.parseInt(parts[1].substring(1, 2));
                System.out.println(level);
            } else {
                System.out.println(parts[0]);
                System.out.println(parts[1]);
                parts[0] = parts[0] + " " + parts[1];
                System.out.println(parts[0]);
                level = (int) Integer.parseInt(parts[2].substring(1, 2));
            }
            skills.add(new Skill(parts[0],level ));
        }
    }

    public int findSkillLevelByName(String skill) {
/*        if (skills.isEmpty()){
            throw new SkillNotFoundException();
        }*/
//        try (){
//        } catch (){
//            throw new SkillNotFoundException();
//        }
        for (Skill actualSkill: skills)
        {
            if (actualSkill.getName().equals(skill)){
                System.out.println(actualSkill.getName());
                System.out.println(actualSkill.getLevel());
                return actualSkill.getLevel();
            }
        }
        return 0;
    }

 //
}
