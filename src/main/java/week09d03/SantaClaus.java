package week09d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SantaClaus {

    private List<Person> persons;

    public SantaClaus(Person...persons) {
        this.persons = Arrays.asList(persons);
    }

    public void getThroughChimneys(){
        for (Person person: persons) {
            person.setPresent();
        }
    }



}
